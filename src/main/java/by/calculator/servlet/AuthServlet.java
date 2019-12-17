package by.calculator.servlet;

import by.calculator.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/authentication")
public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User currentUser = new User(login, password);
        for (User user : (List<User>) getServletContext().getAttribute("userList")) {
            if (user.equals(currentUser)) {
                req.getSession().setAttribute("currentUser", user);
                req.getSession().setAttribute("currentUserName", user.getName());
                req.getServletContext().getRequestDispatcher("/calculator.jsp").forward(req, resp);
                return;
            }
        }
        req.getServletContext().getRequestDispatcher("/authentication.jsp").forward(req, resp);
    }
}
