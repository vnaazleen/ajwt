import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		out.println("<h1>" + user + "</h1>");
		out.println("<a href='SecondServlet?user=" + user + "'>SecondServlet</a>");
		out.close();
	}
}