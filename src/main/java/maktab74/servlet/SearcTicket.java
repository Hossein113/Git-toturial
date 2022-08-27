package maktab74.servlet;

import maktab74.domain.Ticket;
import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearcTicket extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String origin = req.getParameter("origin");
        String dist = req.getParameter("dist");
        String date = req.getParameter("date");


        List<Ticket> showTickets = ApplicationContext.getTicketService().findByOriginAndDestAndDate(origin, dist, date);


        if (showTickets.size() != 0) {
            req.setAttribute("hasTicket", true);
            req.setAttribute("search", showTickets);
            req.setAttribute("source", showTickets.get(0).getOrigin());
            req.setAttribute("dest", showTickets.get(0).getDestination());
            req.setAttribute("time", showTickets.get(0).getMoveDate());

            req.getRequestDispatcher("/select.jsp").forward(req, resp);

        } else {
            req.setAttribute("hasTicket", false);
            req.setAttribute("nofind", "موردی یافت نشد");
            req.getRequestDispatcher("/select.jsp").forward(req, resp);
        }
//        if (showTickets != null) {
//            resp.setContentType("text/html");
//
//            try {
//
//                PrintWriter out = resp.getWriter();
//                showTickets.forEach(t -> {
//                    out.println("<p>" + t + "</p?");
//                    out.println("<br>");
//                });
//                out.close();
//            } catch (IOException e) {
//              e.printStackTrace();
//            }
//
//
//        } else {

//
    }
}


