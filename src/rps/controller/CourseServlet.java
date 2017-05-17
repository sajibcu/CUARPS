package rps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.CourseModel;
import rps.services.CourseService;

/**
 * Servlet implementation class CourseServlet
 */
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cid1=request.getParameter("cid");
		int cid=Integer.parseInt(cid1);
		String ctl=request.getParameter("ctl");
		String ccd1=request.getParameter("ccd");
		int ccd=Integer.parseInt(ccd1);
		CourseModel course=new CourseModel();
		course.setCid(cid);
		course.setCtl(ctl);
		course.setCcd(ccd);
		
		CourseService cs=new CourseService();
		if(cs.entry(course))
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("succesfullentry.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher= request.getRequestDispatcher("ErrorAddStudent.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
