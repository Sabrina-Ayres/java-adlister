import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ChooseColorServlet", urlPatterns = "/choose-color")
public class ChooseColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String output = "";
        output += "<h1>Enter a color below: </h1>";
        output += "<form action='/choose-color' method='POST'>";
        output += "<input type='text' name='choice' placeholder='Color here...' />";
        output += "<button>Submit</button>";
        output += "</form>";
        out.println(output);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String colorChoice = req.getParameter("choice");
        System.out.println(colorChoice);
        resp.sendRedirect("/view-color?choice=" + colorChoice);
    }

}
