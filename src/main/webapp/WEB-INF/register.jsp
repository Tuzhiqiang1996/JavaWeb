<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
       <link rel="stylesheet" href="style/index.css">
</head>
<body class="bg">
<div class="login">
<h1>用户注册</h1>
<form action="register" method="post">
   <p class="ptext">   <span>用户名:</span><input type="text" name="username"></p>
        <p class="ptext">  <span>密&nbsp;&nbsp;&nbsp;码:</span><input type="password" name="password"></p>
    <p><input type="submit" value="注册" onclick=" return  register() "> <input type="reset" value="重置"></p>
    <p><a href="/logingoto">登录</a></p>
</form><div>
<script>
function register(){
let u=document.getElementsByName("username").value;
let p=document.getElementsByName("password").value;
if(u!=''&&p!=""){
alert('注册失败')
return true;
}
return false;
}

</script>
</body>
</html>