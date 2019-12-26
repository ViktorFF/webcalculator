package by.calculator.servlet;

import by.calculator.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/change")
public class ChangeParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String changeParam = req.getParameter("changeParam");
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        req.getSession().setAttribute("changeParam", changeParam);
        switch (changeParam) {
            case "userName":
                req.getSession().setAttribute("oldValue", currentUser.getName());
                break;
            case "age":
                req.getSession().setAttribute("oldValue", currentUser.getAge());
                break;
            case "login":
                req.getSession().setAttribute("oldValue", currentUser.getLogin());
                break;
            case "password":
                req.getSession().setAttribute("oldValue", currentUser.getPassword());
                break;
        }
        req.getServletContext().getRequestDispatcher("/change.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String changeParam = (String) req.getSession().getAttribute("changeParam");
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        switch (changeParam) {
            case "userName":
                currentUser.setName(req.getParameter("newValue"));
                break;
            case "age":
                currentUser.setAge(Integer.parseInt(req.getParameter("newValue")));
                break;
            case "login":
                currentUser.setLogin(req.getParameter("newValue"));
                break;
            case "password":
                currentUser.setPassword(req.getParameter("newValue"));
                break;
        }
    }
}
