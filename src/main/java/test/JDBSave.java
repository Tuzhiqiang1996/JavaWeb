package test;

import dao.UserDao;
import domain.User;

public class JDBSave {
  public static void main(String[] args) {
    UserDao u=new UserDao();
    User user=new User();
    user.setUsername("777");
    user.setProssword("123456");
    boolean flag=u.save(user);
    if(flag){
      System.out.println("成功");
    }else{
      System.out.println("失败");
      System.out.println(user);
    }
  }
}
