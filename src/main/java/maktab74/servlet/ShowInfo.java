package maktab74.servlet;

import maktab74.domain.UserTicket;
import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowInfo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ticketId = req.getParameter("ticketId");
        Long ticket = Long.valueOf(ticketId);
        UserTicket tiket = ApplicationContext.getUserTicketService().findById(ticket);


        req.setAttribute("ticketCode", tiket.getTicketUser().getTicketCode());
        req.setAttribute("userTicket", tiket.getNameUserTicket());
        req.setAttribute("gender", tiket.getGender());
        req.setAttribute("origin", tiket.getTicketUser().getOrigin());
        req.setAttribute("dest", tiket.getTicketUser().getDestination());
        req.setAttribute("date", tiket.getTicketUser().getMoveDate());
        req.setAttribute("time", tiket.getTicketUser().getMoveTime());
        req.setAttribute("travelCode", tiket.getTicketUser().getTravelCode());
        req.setAttribute("ticket", tiket.getId());

        req.getRequestDispatcher("/showInfo.jsp").forward(req, resp);

    }


}