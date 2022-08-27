<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<body>

<h2>welcome to Application!</h2>


<form action="/login" method="post">
    <label>username</label>
    <input type="text" name="username">
    <label>password</label>
    <input type="password" name="password">
    <input type="submit" value="login">

</form>

<%
    String message = (String) request.getAttribute("message");
    if (message != null) {
%>
<h1><% out.print(message);
} %></h1>


<form action="/signup" method="post">
    <label>firstname</label>
    <input type="text" name="firstname">
    <label>lastname</label>
    <input type="text" name="lastname">
    <label>username</label>
    <input type="text" name="username">
    <label>password</label>
    <input type="text" name="password">
    <input type="submit" value="createAcount">
</form>

<%
    String save = (String) request.getAttribute("save");
    if (save != null) {
%>
<h2><% out.print(save);
} %></h2>

</body>
</html>