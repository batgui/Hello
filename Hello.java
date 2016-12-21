// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Hello extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
     
		String title="a-b";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
			
      out.println(docType + "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor=\"#f0f0f0\">\n" +
         "<h1 align=\"center\">" + title + "</h1>\n" +
         "<ul>\n" +
         
         + (Integer.parseInt(request.getParameter("a")) -Integer.parseInt(request.getParameter("b"))) +
         "</ul>\n" +
         "</body></html>");
   }
}