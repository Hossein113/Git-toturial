package maktab74.servlet;

import maktab74.domain.User;
import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowBuyTicket extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = ApplicationContext.getUserSecurity().getCurrentUser();
        req.setAttribute("user", currentUser);
        req.getRequestDispatcher("/showTicketBuy.jsp").forward(req, resp);
    }
}
