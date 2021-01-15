1.下载好 xampp 可视化navicat.exe 工具 idea（社区版或者完整版）

2.数据库配置好
现 新建数据库为test 
表名love 
id   自增 int
name    varchar
pwd     varchar

3.idea连接数据库 名test
连接名 root
连接密码 为空

4.pom.xml
中配置tomcat7 启动maven（因为用的是社区版的）
启动项目 tomcat7:run

5.打开xampp start**

6.浏览web-inf下的jsp页面 在web.xml中配置
6.1连接事件 
```xml
  <servlet>
        <servlet-name>login</servlet-name> 
        <servlet-class>servlet.Login</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>login</servlet-name>
        <url-pattern>/login</url-pattern>
    </servlet-mapping>
   ``` 

6.2跳转jsp页面
```xml
  <servlet>
        <servlet-name>logingoto</servlet-name>
        <jsp-file>/WEB-INF/login.jsp</jsp-file>
    </servlet>
 
    <servlet-mapping>
        <servlet-name>logingoto</servlet-name>
        <url-pattern>/logingoto</url-pattern>
    </servlet-mapping>

```
6.3 在java中验证信息是 想要跳转到指定的jsp页面时 对应的 /logingoto
```xml
页面跳转
  <a href="/logingoto">登录</a>

```
  ```java
java 中 在web.xml 已经定义好的
  response.sendRedirect("/loginSucceed");
  
  ```
        

时间 2021/1/15 10:52:10

在web.xml
中定义好路由一样的格式 方便跳转 /想要跳转的路径或者变量