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

//HttpServlet
@WebServlet("/Regin")
public class Regin extends HttpServlet {


  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
//设置字符
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    //转换字符串
    String username = request.getParameter("username");
    String possword = request.getParameter("password");

    //调用UserDao、User
    User u = new User();
    UserDao ud = new UserDao();

    //添加用户提交的数据到数据库
    u.setUsername(username);
    u.setProssword(possword);
    //处理结果跳转相应页面
    boolean flag = ud.save(u);
    if (flag) {
      if (username != "" && possword != "") {
        response.sendRedirect("/logingoto");
        System.out.println("注册成功！");
      }else{
        response.sendRedirect("/registergoto");
      }
    } else {
      response.sendRedirect("/registergoto");
      System.out.println("注册失败！");

    }
  }


  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request, response);
  }
}
