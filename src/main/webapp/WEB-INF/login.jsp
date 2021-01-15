<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
 <link rel="stylesheet" href="style/index.css">
</head>
<body class="bg">
<div class="login">

<h1>用户登录</h1>

<!--${pageContext.request.contextPath}/servlet/-->
<form action="login"  method="post">
    <p class="ptext">   <span>用户名:</span><input type="test" name="username"></p>
    <p class="ptext">  <span>密&nbsp;&nbsp;&nbsp;码:</span><input type="password" name="password"></p>
    <p><input type="submit" value="登录"> <input type="reset" value="重置"></p>
    <p><a href="/registergoto">注册</a></p>
</form>
</div>
</body>
</html>