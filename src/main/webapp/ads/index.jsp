<%--
  Created by IntelliJ IDEA.
  User: sabrinaayres
  Date: 4/13/21
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>All Ads</title>
</head>

<body>

<h1>Ads</h1>

<c:forEach items="${ads}" var="ad">
    <div>
        <h2>Ad Title: ${ad.title}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>

</html>
