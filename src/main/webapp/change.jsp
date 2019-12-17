<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.12.2019
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change</title>
</head>
<body>
<form action="change" method="post">
    <label>
        <input type="text" readonly value=<%= request.getSession().getAttribute("oldValue")%> >
    </label>
    <label>
        <input type="text" name="newValue" placeholder="New value">
    </label>
    <button type="submit">Change</button>
</form>
<%--<form action="account" method="get">--%>
<%--    <button type="submit">Back</button>--%>
<%--</form>--%>
</body>
</html>
