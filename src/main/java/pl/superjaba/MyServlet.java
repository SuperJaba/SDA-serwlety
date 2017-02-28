package pl.superjaba;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.List;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final List<String> names = Arrays.asList("Seba", "Grzegorz", "Mikolaj", "Szwania", "Misza");
        final PrintWriter writer = resp.getWriter(); //resp.getWriter.var
        resp.setContentType("text/html");


        writer.write("Hello " + req.getParameter("name"));
        writer.write("</h2>");

        Integer counter = new Integer(req.getParameter("counter"));

        names.stream()
                .limit(counter)
                .forEach(e -> writer.write("<li>" + e + "</li>"));


        writer.write("<ul>");//unordered list
        names.forEach(e -> writer.write("<li>" + e + "</li>")); //lambda po liscie i dodanie imion
        writer.write("</ul>");
        writer.write(req.getRequestURI());
//        PrintWriter writer1 = resp.getWriter();
//        writer1.write();
    }
}
