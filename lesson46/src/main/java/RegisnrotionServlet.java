import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by java on 23.05.2017.
 */
@WebServlet("/user/registration")
public class RegisnrotionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("../pages/user/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req);

        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password= req.getParameter("password");
        String confifmationPassword = req.getParameter("password-confirmation");
        String userRole = req.getParameter("user-role");
        String lang = req.getParameter("lang");

        System.out.println("login " + login);
        System.out.println("email " + email);
        System.out.println("password " + password);
        System.out.println("password-confirmation " + confifmationPassword);
        System.out.println("user-role " + userRole);
        System.out.println("lang " + lang);
    }
}
