import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
 
 
public class UserDetails extends HttpServlet {
 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
 
		String sno, sname, branch, college;
 
		sno = request.getParameter("sno");
		sname = request.getParameter("sname");
		branch = request.getParameter("branch");
		college = request.getParameter("college");
 
		out.println("<html><body>");
		out.println("<h1> User Details </h1>");
		out.println("<table>");
		out.println("<tr><th>Reg No</th><td>" + sno + "</td></tr>"); 
		out.println("<tr><th>Name</th><td>" + sname + "</td></tr>"); 
		out.println("<tr><th>Branch</th><td>" + branch + "</td></tr>"); 
		out.println("<tr><th>College</th><td>" + college + "</td></tr>"); 
		out.println("</table>");
		out.println("</body></html>");
 
	} 
}
