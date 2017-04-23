<%--
  Created by IntelliJ IDEA.
  User: caochenghua
  Date: 2017/4/23
  Time: 下午12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%--<%request.setCharacterEncoding("utf8");%>--%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登陆</title>
</head>
<body>
    <form action="login.html" method="post">
        name:<input name="uname" type="text">
        pass:<input name="password" type="password">
        <input type="submit">
    </form>
    <p>${error}</p>
</body>
</html>
