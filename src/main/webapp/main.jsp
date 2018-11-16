<%--
  Created by IntelliJ IDEA.
  User: 25778
  Date: 2018/11/8
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>main</title>
</head>
<body>
欢迎：${sessionScope.username}<br/>
<table border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>年龄</td>
        <td colspan="2">操作</td>
    </tr>
    <c:forEach items="${sessionScope.list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.age}</td>
            <td><a href="updata?id=${user.id}">updata</a></td>
            <td><a href="del?id=${user.id}" onclick="return confirm('删吗？')">del</a></td>
        </tr>

    </c:forEach>

</table>
<a href="add.jsp">add</a>

</body>
</html>
