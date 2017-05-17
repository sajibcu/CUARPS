package rps.controller;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserLog;
import rps.services.LogInService;

/**
 * Servlet implementation class LogIn
 */
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
		//out.println("success");
		String name,password;
		name=request.getParameter("name");
		password=request.getParameter("password");
		UserLog us=new UserLog();
		us.setName(name);
		//out.println(us.name);
		us.setPassword(password);
		LogInService1 log=new LogInService1();
		int a=log.match(us);
		//System.out.print(a);
		if(a==3)
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("admin.jsp");
			dispatcher.forward(request, response);
		}
		else if(a==1)
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("teacher.jsp");
			dispatcher.forward(request, response);
		}
		else if(a==2)
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("student.jsp");
			dispatcher.forward(request, response);
		}
		else 
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
