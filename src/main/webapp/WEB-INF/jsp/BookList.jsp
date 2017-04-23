<%--
  Created by IntelliJ IDEA.
  User: caochenghua
  Date: 2017/4/23
  Time: 下午11:25
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">@import url("<c:url value="/css/style.css"/> ");</style>
</head>
<body>
<h1>Book List</h1>
<a href="<c:url value="/book_input"/> ">Add Book</a>
<table>
    <tr>
        <th>Category</th>
        <th>Title</th>
        <th>ISBN</th>
        <th>Author</th>
        <th>&nbsp;</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.category.name}</td>
            <td>${book.title}</td>
            <td>${book.isbn}</td>
            <td>${book.author}</td>
            <td><a href="book_edit/${book.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
