<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10.12.2019
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account</title>
</head>
<body>
<jsp:include page="main.jsp"></jsp:include>
<form action="change" method="get">
    <p>
        User Name: <%= request.getSession().getAttribute("currentUserName")%>
        <button type="submit" name="changeParam" value="userName">Change</button>
    </p>
    <p>
        Age: <%= request.getSession().getAttribute("currentUserAge")%>
        <button type="submit" name="changeParam" value="age">Change</button>
    </p>
    <p>
        Login: <%= request.getSession().getAttribute("currentUserLogin")%>
        <button type="submit" name="changeParam" value="login">Change</button>
    </p>
    <p>
        Password: <%= request.getSession().getAttribute("currentUserPassword")%>
        <button type="submit" name="changeParam" value="password">Change</button>
    </p>
</form>
<form action="${pageContext.request.contextPath}/history" method="get">
    <button type="submit">History</button>
</form>
</body>
</html>
