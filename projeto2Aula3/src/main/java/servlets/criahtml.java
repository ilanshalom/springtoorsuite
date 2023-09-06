package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/criahtml")
public class criahtml extends HttpServlet {
	private static final long serialVersionUID = 1L;
        

	protected void service(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/Html;charset=UF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>gerando HTML</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H2>Html gerado pelo servlet fica muito legal</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
