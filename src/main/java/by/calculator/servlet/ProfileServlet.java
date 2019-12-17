package by.calculator.servlet;

import by.calculator.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/account")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        req.getSession().setAttribute("currentUserName", currentUser.getName());
        req.getSession().setAttribute("currentUserAge", currentUser.getAge());
        req.getSession().setAttribute("currentUserLogin", currentUser.getLogin());
        req.getSession().setAttribute("currentUserPassword", currentUser.getPassword());
        req.getServletContext().getRequestDispatcher("/account.jsp").forward(req, resp);
    }
}
