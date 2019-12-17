<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05.12.2019
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
<jsp:include page="main.jsp"></jsp:include>
<form action="calculator" method="post">
    <p>
        <label>A:
            <input type="text" name="firstElement">
        </label>
    </p>
    <p>
        <label>B:
            <input type="text" name="secondElement">
        </label>
    </p>
    <p>Result:
        <label>
            <input type="text" readonly="readonly" value=<%= request.getAttribute("result") %>>
        </label>
    </p>
    <p>
        <button name="operation" value="sum">+</button>
        <button name="operation" value="sub">-</button>
        <button name="operation" value="mult">*</button>
        <button name="operation" value="div">:</button>
    </p>
</form>
</body>
</html>
