package pl.superjaba;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RENT on 2017-02-28.
 */
public class PathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        String url = req.getRequestURI();
//        String name = url.substring(url.lastIndexOf("/") + 1);
//        writer.write("<h1>" + name + "</h1>");

        List<String> names = Arrays.asList("Seba", "Grzegorz", "Mikolaj", "Szwania", "Misza");
        Integer index = new Integer(url.substring(url.lastIndexOf("/")+1));
        writer.write("<h1>" + names.get(index) + "</h1>");

        List<User> users = Arrays.asList(new User("Maria", "Kaczorek", "897-234-222"));
    }
}
