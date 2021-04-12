<%--
  Created by IntelliJ IDEA.
  User: sabrinaayres
  Date: 4/9/21
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="Users.Contact" %>


<html>
<head>
    <title>Contacts</title>
</head>
<body>

<h1>Contacts</h1>

<table>

    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone Number</th>
    </tr>


    <c:forEach items="${contacts}" var="contact">
        <c:if test="${contact.IsActive}">
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.address}</td>
                <td>${contact.phoneNumber}</td>
            </tr>
        </c:if>
    </c:forEach>


</table>


</body>
</html>
