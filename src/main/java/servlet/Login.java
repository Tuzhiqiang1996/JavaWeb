package servlet;


import dao.UserDao;
import domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Administrator
 */
@WebServlet("/Login")
public class Login extends HttpServlet {


  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
//设置字符
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    //转换字符串
    String username = request.getParameter("username");
    String possword = request.getParameter("password");
    //调用UserDao、UserDao
    UserDao ud = new UserDao();
    boolean flag = ud.checklogin(username, possword);
    if (flag) {
      //将提交的用户名存入session，前台登录成功页面调取
      HttpSession session = request.getSession();
      session.setAttribute("username", username);
      //登录成功后跳转
      response.sendRedirect("/loginSucceed");
      System.out.println("登录成功！");

      System.out.println(username+"username" );
      System.out.println(possword+"possword" );

//      request.getRequestDispatcher("loginSucceed.jsp").forward(request, response);
    } else {
      response.sendRedirect("/loginFailed");
      System.out.println("登录失败！");
    }
  }


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
    doPost(request, response);
  }
}
