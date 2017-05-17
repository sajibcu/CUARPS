package rps.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserAddSt;
import rps.services.studentservice;

/**
 * Servlet implementation class studentservlet
 */
public class studentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idd=request.getParameter("id");
		int id=Integer.parseInt(idd);
		studentservice ss=new studentservice();
		UserAddSt user=ss.retrive(id);
		if(user.getName()!="")
		{
			request.getSession().setAttribute("user", user);
			response.sendRedirect("studentinfodisplay.jsp");
		}
		else {
			PrintWriter out = response.getWriter();
			request.getRequestDispatcher("studentinfo.jsp").include(request, response);
			out.println(" you enter wrong id!!!!!!!!!!..try again");
		}
	}

}
