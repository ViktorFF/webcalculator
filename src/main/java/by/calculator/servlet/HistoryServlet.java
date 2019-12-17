package by.calculator.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/history")
public class HistoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> history = (ArrayList<String>) req.getSession().getAttribute("history");
        if (!history.isEmpty()) {
            for (String str: history) {
                resp.getWriter().println(str);
            }
            return;
        }
        resp.getWriter().println("History is empty!");
    }
}
