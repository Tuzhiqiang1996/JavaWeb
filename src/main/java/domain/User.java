package domain;


public class User {
  protected String username;
  protected String prossword;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {

    if (username != "") {

      this.username = username;
    }
  }

  public String getProssword() {
    return prossword;
  }

  public void setProssword(String prossword) {
    if (prossword != "") {

      this.prossword = prossword;
    }
  }

  @Override
  public String toString() {
    return "User{" +
    "name='" + username + '\'' +
    ", pwd='" + prossword + '\'' +
    '}';
  }


}
