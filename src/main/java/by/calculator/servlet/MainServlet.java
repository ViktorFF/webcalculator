package by.calculator.servlet;

import by.calculator.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/calculator")
public class MainServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstElement = req.getParameter("firstElement");
        String secondElement = req.getParameter("secondElement");
        String operation = req.getParameter("operation");
        int a = 0;
        int b = 0;
        double result = 0;

        try {
            a = Integer.parseInt(firstElement);
            b = Integer.parseInt(secondElement);
        } catch (NumberFormatException e) {
            resp.getWriter().println("Wrong input element!");
            resp.getWriter().println("<a href=\"calculator.jsp\">Back</a>");
            return;
        }

        result = Calculator.start(a, b, operation);
        ArrayList<String> history = (ArrayList<String>) req.getSession().getAttribute("history");
        history.add("[" + LocalDateTime.now() + "]: " + a + " " + operation + " " + b + " = " + result);
        req.setAttribute("result", result);
        req.getServletContext().getRequestDispatcher("/calculator.jsp").forward(req, resp);
    }
}
