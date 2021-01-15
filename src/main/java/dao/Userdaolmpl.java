package dao;

import domain.User;

public interface Userdaolmpl {

  //定义两个待解决的方法 t/f
  public boolean save(User user);
  public boolean checklogin(String username,String possword);
}
