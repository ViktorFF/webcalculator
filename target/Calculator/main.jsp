<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.12.2019
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main</title>
</head>
<body>
<form action="account" method="get">
    <button type="submit">
        <%= request.getSession().getAttribute("currentUserName")%>
    </button>
</form>
<form action="calculator" method="post">
    <button type="submit">Calculator</button>
</form>
<form action="logout" method="get">
    <button type="submit">Logout</button>
</form>
</body>
</html>
