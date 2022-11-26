package pack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorld", urlPatterns = "/hello")
public class HelloWorld extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World! World! World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!Hello World!Hello World!Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
