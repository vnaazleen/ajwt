import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Cookie;

public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie ck[] = request.getCookies();
		
		String user = ck[0].getValue();
		out.println("<h1>" + user + "</h1>");
		out.close();
	}
}