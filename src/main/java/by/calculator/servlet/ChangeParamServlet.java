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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String changeParam = (String) req.getSession().getAttribute("changeParam");
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        if (changeParam.equals("userName")) {
            currentUser.setName(req.getParameter("newValue"));
        } else if (changeParam.equals("age")) {
            currentUser.setAge(Integer.parseInt(req.getParameter("newValue")));
        } else if (changeParam.equals("login")) {
            currentUser.setLogin(req.getParameter("newValue"));
        } else if (changeParam.equals("password")) {
            currentUser.setPassword(req.getParameter("newValue"));
        }
    }
}
