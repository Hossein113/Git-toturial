package maktab74.servlet;

import maktab74.domain.Ticket;
import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubmitTicket extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        resp.sendRedirect("/selectGender.jsp");
//
//        String ticketId = req.getParameter("ticketId");
//        Long id = Long.valueOf(ticketId);
//        Ticket byId = ApplicationContext.getTicketService().findById(id);
//
//        ApplicationContext.getTicketSecurity().setCurrenticket(byId);

        // System.out.println("from post method : " + id);

        String ticketId = req.getParameter("ticketId");
        Long id = Long.valueOf(ticketId);

        Ticket ticket = ApplicationContext.getTicketService().findByIdWithQuri(id);
        if (ticket != null) {
            ApplicationContext.getTicketSecurity().setCurrenticket(ticket);
        }

        resp.sendRedirect("/selectGender.jsp");


    }


}



