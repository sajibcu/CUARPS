package rps.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserAddSt;
import rps.services.StudentInfoService;

/**
 * Servlet implementation class StudentInfoServlet
 */
public class StudentInfoServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfoServlet() {
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
		UserAddSt user;
		StudentInfoService us=new StudentInfoService();
		user =us.studentinfo(id);
		System.out.print(user.getName());
		
	}

}
