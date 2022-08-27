<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>


<head>
    <title>Login</title>

    <link rel="stylesheet" type="text/css" href="login.css">

    <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>

<body>

<%
    String wrong = (String) request.getAttribute("message");
    String save = (String) request.getAttribute("save");

%>


<div class="start">
    <div class="main">
        <input type="checkbox" id="chk" aria-hidden="true">

        <div class="signup">
            <form action="/login" method="post">
                <label for="chk" aria-hidden="true">Login</label>
                <input type="text" name="username" placeholder="User name" required="">
                <input type="password" name="password" placeholder="Password" required="">
                <button>Login</button>

            </form>
            <% if (wrong != null) {
            %>
            <div class="wrong">
                <%out.print(wrong);%>
            </div>
            <% }%>
            <% if (save != null) {
            %>
            <div class="suc">
                <%out.print(save);%>
            </div>
            <% }%>


        </div>

        <div class="login">
            <form action="/signup" method="post">
                <label for="chk" aria-hidden="true">Sign Up</label>
                <input type="text" name="firstname" placeholder="First Name" required="">
                <input type="text" name="lastname" placeholder="Last Name" required="">
                <input type="text" name="username" placeholder="User Name" required="">
                <input type="password" name="assword" placeholder="Password" required="">
                <button>Sign Up</button>
            </form>

        </div>
    </div>
</div>

</body>
</html>













