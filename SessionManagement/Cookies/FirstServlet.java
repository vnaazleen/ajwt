import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;

public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		Cookie ck = new Cookie("user", user);
		
		out.println("<h1>" + user + "</h1>");
		response.addCookie(ck);
		out.println("<a href=SecondServlet>SecondServlet</a>");
		out.close();
	}
}