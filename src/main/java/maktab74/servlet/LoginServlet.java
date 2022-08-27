package maktab74.servlet;


import maktab74.domain.User;
import maktab74.util.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User checkUser = ApplicationContext.getUserService().findByUserNameAndPassword(username, password);

        if (checkUser != null) {
            ApplicationContext.getUserSecurity().setCurrentUser(checkUser);

            resp.sendRedirect("/select.jsp");
        } else {

            req.setAttribute("message", "username or password is wrong !!!");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
//        User checkUser = ApplicationContext.getUserService().findByUserNameAndPassword(username, password);
//        if (checkUser != null) {
//        } else {

        req.setAttribute("list", Arrays.asList("a", "b", "c"));

//            resp.sendRedirect("/index.jsp");
//        }
    }
}
