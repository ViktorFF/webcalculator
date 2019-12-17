<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05.12.2019
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
<form action="registration" method="post">
    <p>
        <label>User Name:
            <input type="text" name="name" placeholder="Name">
        </label>
    </p>
    <p>
        <label>Age:
            <input type="text" name="age" max="100" placeholder="Age">
        </label>
    </p>
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
        <button type="submit">Registry</button>
    </p>
</form>
</body>
</html>
