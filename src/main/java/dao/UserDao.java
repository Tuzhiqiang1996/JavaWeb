package dao;

import domain.User;
import util.DButil;

import java.sql.*;

//实现接口的类，返回值为布尔类型
public class UserDao implements Userdaolmpl {


  public boolean save(User user) {
    boolean flag = false;
    Connection conn;
    PreparedStatement pst = null;
    /**
     创建连接Connection对象和Statement对象
     调用插入数据到数据库的方法
     */
    conn = DButil.getConnection();

    String sql = "INSERT INTO love(name, pwd) values(?,?)";

    try {
      pst = conn.prepareStatement(sql);
      pst.setString(1, user.getUsername());
      pst.setString(2, user.getProssword());
      int row = pst.executeUpdate();
      if (row > 0) {
        flag = true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      DButil.close(pst, conn);
    }
    return flag;

  }

  public boolean checklogin(String username, String possword) {
    boolean flag=false;
    Connection conn;
    Statement st=null;
    ResultSet rs=null;
    String sql ="select * from love where name = '"+ username +"'";
    conn =DButil.getConnection();
    try {
      st=conn.prepareStatement(sql);
      rs=st.executeQuery(sql);
      while (rs.next()){
        if(rs.getString("pwd").equals(possword)){
          flag = true;
        }
      }
    }catch (SQLException e){
      e.printStackTrace();
    }finally {
      DButil.close(rs,st,conn);
    }
    return flag;
  }
}
