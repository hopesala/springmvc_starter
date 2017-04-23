<%--
  Created by IntelliJ IDEA.
  User: caochenghua
  Date: 2017/4/23
  Time: 下午11:36
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">@import url("<c:url value="/css/style.css"/> ");</style>
</head>
<body>
<form:form commandName="book" action="/book_save" method="post">
    <fieldset>
        <legend>Add a book</legend>
        <form:select path="category.id" id="category" items="${categories}" itemLabel="name" itemValue="id"/>
        <form:input path="title" id="title"/>
        <form:input path="author" id="author"/>
        <form:input path="isbn" id="isbn"/>
        <input id="reset" type="reset">
        <input id="submit" type="submit" value="Add Book">
    </fieldset>
</form:form>
</body>
</html>
