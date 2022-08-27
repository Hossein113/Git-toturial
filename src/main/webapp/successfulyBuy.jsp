<%--
  Created by IntelliJ IDEA.
  User: Hossein
  Date: 8/24/2022
  Time: 3:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css">

</head>
<body>
<%
    String name = (String) request.getAttribute("name");
    String ticket = (String) request.getAttribute("codeTicket");
    String gender = (String) request.getAttribute("gender");
%>
<dive>
    <h2 class="successful cent">
        خرید بلیط شما با موفقیت انجام شد  <% out.print(name); %> <% out.print(gender);%>
        <br>
        <br>
        <br>
        <%out.print(ticket); %> :شناسه بلیط
    </h2>
</dive>
<ul>
    <li><a href="/select.jsp">خرید بلیط</a></li>

    <li><a href="/showTicketBuy" methods="get">نمایش بلیط</a></li>


</ul>
</body>
</html>
