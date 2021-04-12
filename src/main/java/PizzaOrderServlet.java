import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet (name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        String crust = request.getParameter("crust");
        request.setAttribute("crust", crust);
        System.out.println(crust);

        String sauce = request.getParameter("sauce");
        request.setAttribute("sauce", sauce);
        System.out.println(sauce);

        String size = request.getParameter("size");
        request.setAttribute("size", size);
        System.out.println(size);

        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);


    }
}
