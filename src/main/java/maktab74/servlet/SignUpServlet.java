package maktab74.servlet;

import maktab74.domain.User;
import maktab74.util.ApplicationContext;
import maktab74.util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUpServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        EntityManagerFactory entityManagerFactory = HibernateUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User(firstname, lastname, username, password);

        User save = ApplicationContext.getUserService().save(user);
        if (save != null) {
            req.setAttribute("save", "successfully signup !");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);


        }
    }
}

