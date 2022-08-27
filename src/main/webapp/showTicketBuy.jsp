<%@ page import="maktab74.domain.User" %>
<%@ page import="maktab74.domain.UserTicket" %>
<%@ page import="maktab74.util.ApplicationContext" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Hossein
  Date: 8/24/2022
  Time: 5:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <title>Title</title>
    <link rel="stylesheet" href="style.css">

</head>

<body>


<table align="center">
    <thead>
    <tr class="thead3">
        <th colspan="3"> &emsp; لیست بلیط های خریداری شده</th>
    </tr>


    </thead>

    <tbody>
    <tr>
        <th>تاریخ</th>
        <th>شناسه بلیط</th>
        <th>انتخاب</th>
    </tr>
    <%
        User user = (User) request.getAttribute("user");
        List<UserTicket> userTickets = ApplicationContext.getUserTicketService().findtickrtForUser(user);
        for (UserTicket ticket : userTickets
        ) {


    %>


    <tr>
        <td><%out.print(ticket.getTicketUser().getMoveDate());%></td>
        <td><%out.print(ticket.getTicketUser().getTicketCode());%></td>
        <td>


            <a href="/showinfo?ticketId=<%out.print(ticket.getId());%>"> نماش بلیط</a>


        </td>
    </tr>
    <%
        }
    %>

    </tbody>

</table>

</body>
</html>
