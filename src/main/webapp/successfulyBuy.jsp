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

<div>
    <a class="item" href="/select.jsp">خرید بلیط</a>
    <br>
    <a class="item" href="/showTicketBuy" methods="get">نمایش بلیط</a></li>
</div>


</body>
</html>
