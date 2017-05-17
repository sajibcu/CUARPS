package rps.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserAddSt;
import rps.services.SrcResultSer;

/**
 * Servlet implementation class SrcResultS
 */
public class SrcResultS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrcResultS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserAddSt user=new UserAddSt();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setSemister(request.getParameter("yr"));
		SrcResultSer srs=new SrcResultSer();
		user=srs.retrive(user);
		//System.out.print(user.getGpa());
		request.getSession().setAttribute("user", user);
		response.sendRedirect("gpa.jsp");
		
	}

}
