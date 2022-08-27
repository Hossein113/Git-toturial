package maktab74.servlet;

import maktab74.domain.Ticket;
import maktab74.domain.User;
import maktab74.domain.UserTicket;
import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BuyTicket extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String gender = req.getParameter("gender");

        Ticket currenticket = ApplicationContext.getTicketSecurity().getCurrenticket();
        User currentUser = ApplicationContext.getUserSecurity().getCurrentUser();
        UserTicket userTicket = new UserTicket(gender, name, currenticket, currentUser);

        UserTicket userTicketNow = ApplicationContext.getUserTicketService().save(userTicket);
        String ticketCode = currenticket.getTicketCode();
        String nameUserTicket = userTicketNow.getNameUserTicket();
        String gender1 = userTicketNow.getGender();
        req.setAttribute("name", nameUserTicket);
        req.setAttribute("codeTicket", ticketCode);

        if (gender.equals("female")) {
            req.setAttribute("gender", "خانم");

        } else {
            req.setAttribute("gender", "آقای");
        }

        req.getRequestDispatcher("/successfulyBuy.jsp").forward(req, resp);


    }
}
