package by.itacademy.git.mergeexperience;

import java.io.*;

import by.itacademy.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/module1")
public class Module1Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Модуль 1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        //by Kozlov
        String tableStyle = "table.myTable,table.myTable th,table.myTable tr,table.myTable td{ width: 450px;" +
                "height:30px;" + "border: solid 1px silver;" +
                "text-align:center;" + "border-collapse: collapse;}";
        List<Theme> listModuleOne = Modules.MODULE1.getThemesOfModule(); //by Kozlov

        out.println("<html>");

        //by Kozlov
        out.println("<head><style>");
        out.println(tableStyle);
        out.println("</style></head>");//by Kozlov

        out.println("<body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<table>");
        for (Module1Topics value : Module1Topics.values())
            if (value.getTopic().equals("GIT")) {
                out.println("<tr><td>"
                        + value.getOrder() + "</td><td>"
                        + value.getTopic() + "</td><td>"
                        + value.getDesc()  + "</td><td>"
                        + value.getHours()
                        + "</td><td><a href='https://prezi.com/view/ROBl3h39RTxz7DdBkRza/'>Подробнее</a>"
                        + "</td></tr>");
            } else if (value.getTopic().equals("Jakarta")) {
                out.println("<tr><td>"
                        + value.getOrder() + "</td><td>"
                        + value.getTopic() + "</td><td>"
                        + value.getDesc()  + "</td><td>"
                        + value.getHours()
                        + "</td><td><a href='https://jakarta.ee/'>Подробнее</a>"
                        + "</td></tr>");
            } else if (value.getTopic().equals("Apache Maven")) {
                out.println("<tr><td>"
                        + value.getOrder() + "</td><td>"
                        + value.getTopic() + "</td><td>"
                        + value.getDesc()  + "</td><td>"
                        + value.getHours()
                        + "</td><td><a href='https://maven.apache.org/'>Подробнее</a>"
                        + "</td></tr>");
            } else {
                out.println("<tr><td>"
                        + value.getOrder() + "</td><td>"
                        + value.getTopic() + "</td><td>"
                        + value.getDesc()  + "</td><td>"
                        + value.getHours()
                        + "</td><td><a href='not_implemented_yet.html'>Подробнее</a>"
                        + "</td></tr>");
            }
        out.println("</table>");

        //by Kozlov
        out.println("<br><br><table class = \"myTable\"><caption><b>Useful links on topics</b></caption>");
        out.println("<thead><tr><th>Theme</th><th>Links</th></tr></thead><tbody>");
        for (Theme value : listModuleOne) {
            out.println("<tr><td>" + value.getNameOfTheme() + "</td><td>");
            for (Link link : value.getLinks()) {
                out.println("<a href=\"" + link.getLink() + "\" target=\"_blank\">" + link.getDescription() + "</a><br>");
            }
            out.println("</td></tr>");
        }
        out.println("</tbody></table>"); //by Kozlov

        out.println("</br><a href=\"/module2\">Следующий модуль&#8594</a>");
        out.println("</br><a href='/'>Назад</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}