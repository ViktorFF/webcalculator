<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17.12.2019
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<h1>History</h1>
<c:if test="${flag}">
    <ul>
        <c:forEach var="event" items="${sessionScope.history}">
            <li>${event}</li>
        </c:forEach>
    </ul>
</c:if>
</body>
</html>
