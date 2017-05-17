package rps.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserLog;
import rps.services.SignUpService;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
		String name,password,type;
		name=request.getParameter("name");
		password=request.getParameter("password");
		type=request.getParameter("type");
		UserLog uLog=new UserLog();
		uLog.setName(name);
		uLog.setPassword(password);
		uLog.setType(type);
		SignUpService sup=new SignUpService();
		PrintWriter out=response.getWriter();
		if(sup.store(uLog))
		{
			//RequestDispatcher dispatcher= request.getRequestDispatcher("admin.jsp");
			//dispatcher.forward(request, response);
			request.getRequestDispatcher("admin.jsp").include(request, response);
			
			out.print("Registration Successfull.. try again.");
		}
		else
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("errorsignup.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
