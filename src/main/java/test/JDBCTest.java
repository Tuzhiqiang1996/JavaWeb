package test;

import util.DButil;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCTest {
  public static void main(String[] args) {
    Connection conn = DButil.getConnection();
    if (conn != null) {
      System.out.println("成功");
    } else {
      System.out.println("fidel");
    }
  }

}
