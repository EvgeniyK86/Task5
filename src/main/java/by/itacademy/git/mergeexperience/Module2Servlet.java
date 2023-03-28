package by.itacademy.git.mergeexperience;

import by.itacademy.git.mergeexperience.topics.Module1Topics;
import by.itacademy.git.mergeexperience.topics.Module2Topics;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/module2")
public class Module2Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Модуль 2";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<table>");
        out.println("<caption>Модуль 2</caption>");
        for (Module2Topics value : Module2Topics.values())
            out.println("<tr><td>"
                    + value.getOrder() + "</td><td>"
                    + value.getTopic() + "</td><td>"
                    + value.getDesc()  + "</td><td>"
                    + value.getHours()
                    + "</td><td><a href='not_implemented_yet.html'>Подробнее</a>"
                    + "</td></tr>");
        out.println("</table>");
        out.println("</br><a href=\"/module1\">&#8592Предыдущий модуль</a>");
        out.println("</br><a href=\"/module3\">Следующий модуль&#8594</a>");
        out.println("</br><a href='/'>Назад</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}