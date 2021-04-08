<%@ page import = "java.util.*" %>

<%--
  Created by IntelliJ IDEA.
  User: sabrinaayres
  Date: 4/8/21
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equals("POST")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Enter your login information: </h1>

<form action="/login.jsp" method="POST">
    <label for="username">Username: </label>
    <input id="username" type="text" name="username" placeholder="Username">
    <label for="password">Password: </label>
    <input id="password" type="password" name="password" placeholder="Password">
    <button>Submit</button>
</form>

</body>
</html>
