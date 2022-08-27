package maktab74.servlet;

import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletTicket extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ticketUser = req.getParameter("ticketUser");
        if (
                ticketUser != null
        ) {
            Long ticket = Long.valueOf(ticketUser);
            ApplicationContext.getUserTicketService().deleteById(ticket);
            resp.sendRedirect("/deletTicket.jsp");
        }
    }
}
