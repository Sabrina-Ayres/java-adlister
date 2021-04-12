package Users;
import Users.Contact;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@WebServlet("/contacts")
public class ViewContactsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Contact> contacts = Arrays.asList(
                new Users.Contact(1, "Jane Smith", "jane@gmail.com", "123 Street", "222.222.2222", true),
                new Users.Contact(2, "Joe Smith", "joe@gmail.com", "456 Lane", "333.333.3333", false),
                new Users.Contact(3, "Jack Smith", "jack@gmail.com", "123 Lane", "444.444.4444", true),
                new Users.Contact(4, "John Smith", "john@gmail.com", "456 Street", "555.555.5555", false),
                new Users.Contact(5, "Jessica Smith", "jessica@gmail.com", "789 Avenue", "666.666.6666", true)
        );

        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("contacts.jsp").forward(req, resp);
    }
}
