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


<%

    List<Users.Contact> contacts = Arrays.asList(
            new Users.Contact(1, "Jane Smith", "jane@gmail.com", "123 Street", "222.222.2222", true),
            new Users.Contact(2, "Joe Smith", "joe@gmail.com", "456 Lane", "333.333.3333", false),
            new Users.Contact(3, "Jack Smith", "jack@gmail.com", "123 Lane", "444.444.4444", true),
            new Users.Contact(4, "John Smith", "john@gmail.com", "456 Street", "555.555.5555", false),
            new Users.Contact(5, "Jessica Smith", "jessica@gmail.com", "789 Avenue", "666.666.6666", true)
    );

    request.setAttribute("contacts", contacts);

%>


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
        <c:if test="${contact.getIsActive() == true}">
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
