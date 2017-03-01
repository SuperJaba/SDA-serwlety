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
 * Created by RENT on 2017-03-01.
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = Arrays.asList(
                new User("Seba", "Pie", "765938909"),
                new User("Marek", "Kaczmarek", "900345987"),
                new User("Anna", "Maria", "85766483"));

            resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
//        writeUsers(resp, userList);
//        writeUsersWithParam(req, userList, writer);
        String requestURI = req.getRequestURI();
        String counterAsString = requestURI.substring(requestURI.lastIndexOf('/') + 1);
        Integer counter = new Integer(counterAsString);
        User user = userList.get(counter);
        writer.write("<hi>"+user.getFirstName()+" "+user.getLastName()+"</h1>");
    }

//    private void writeUsersWithParam(HttpServletRequest req, List<User> userList, PrintWriter writer) {
//        Integer counter = new Integer(req.getParameter("counter"));
//        writer.write("<ul>");
//        userList.stream()
//                .limit(counter)
//                .forEach(e-> writer.write("<li>"+e.getFirstName()+" "+e.getLastName()+"</li>"));
//        writer.write("</ul>");
//    }

//    private void writeUsers(HttpServletResponse resp, List<User> userList) {
//        PrintWriter writer = null;
//        try {
//            writer = resp.getWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        writer.write("<ul>");
//        PrintWriter finalWriter = writer;
//        userList.forEach(e -> finalWriter.write(e.getFirstName() + " " + e.getLastName() + " " + e.getPhoneNumber()));
//        writer.write("</ul>");
//    }
}
