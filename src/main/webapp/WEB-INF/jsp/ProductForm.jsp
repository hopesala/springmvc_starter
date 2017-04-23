<%--
  Created by IntelliJ IDEA.
  User: caochenghua
  Date: 2017/4/23
  Time: 下午6:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%--<%request.setCharacterEncoding("utf8");%>--%>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>

</head>
<body>
<form action="/product_save.action" method="post">
name:<input type="text" id="name" name="name" value="" tabindex="1">
description:<input type="text" id="description" name="description" tabindex="2">
price:<input type="text" id="price" name="price" tabindex="3">
<input id="reset" type="reset" tabindex="4">
<input id="submit" type="submit" tabindex="5" value="Add Product">
</form>
</body>
</html>
