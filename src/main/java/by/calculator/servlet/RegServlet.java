package by.calculator.servlet;

import by.calculator.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/registration")
public class RegServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String age = req.getParameter("age");
        String password = req.getParameter("password");

        if (name.equals("") || age.equals("")) {
            req.getServletContext().getRequestDispatcher("/registration.jsp").forward(req, resp);
        }
        User newUser = new User(name, Integer.parseInt(age), login, password);
        List<User> userList = (List<User>) getServletContext().getAttribute("userList");
        for (User user: userList) {
            if (user.equals(newUser)) {
                req.getServletContext().getRequestDispatcher("/registration.jsp").forward(req, resp);
            }
        }
        userList.add(newUser);
        req.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
