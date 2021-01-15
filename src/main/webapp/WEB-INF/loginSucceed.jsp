<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录成功</title>
     <link rel="stylesheet" href=" ${pageContext.request.contextPath}/style/index.css">
</head>
<body class="bg">
<div  style="width:100%;height:100%"  >
<div style="
         display: flex;
         justify-content: space-around;
         align-items: center;
     ">
    <h1>登录成功，欢迎您：${sessionScope.username}</h1>
<p><a href="./index.jsp">回到首页</a></p>
</div><div>
</body>
</html>