package about_test;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class aboutme
 */
@WebServlet("/today")
public class aboutme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public aboutme() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime today_now = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		String today = today_now.format(pattern);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>몇시에요</title>");
		out.print("<link rel='stylesheet' type='text/css' href='css_test.css'>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p style='text-align:left'><a href='index.html'>메인화면</a></p><br>");
		out.print("<br><br><br><h1> 현재시간 : " + today+ "</h1>");
		out.print("</body>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
