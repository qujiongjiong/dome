<%--
  Created by IntelliJ IDEA.
  User: 25778
  Date: 2018/11/8
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="add" method="post">
    id<input type="text" name="id" value="${user.id}"/>
    username<input type="text" name="name" value="${user.name}"/>
    userpassword<input type="password" name="password" value="${user.password}"/>
    age<input type="text" name="age" value="${user.age}"/>
    <input type="submit" value="提交"/>

</form>
</body>
</html>
