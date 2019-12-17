<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05.12.2019
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Authentication</title>
</head>
<body>
<form action="authentication" method="post">
    <p>
        <label>Login:
            <input type="email" name="login" required placeholder="somebody@example.by">
        </label>
    </p>
    <p>
        <label>Password:
            <input type="password" name="password" required placeholder="Password">
        </label>
    </p>
    <p>
        <button type="submit">SignIn</button>
    </p>
</form>
</body>
</html>
