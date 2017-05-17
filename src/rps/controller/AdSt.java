package rps.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserAddSt;
import rps.services.AddStrudentService;

/**
 * Servlet implementation class AdSt
 */
public class AdSt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdSt() {
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
		String name=request.getParameter("name");
		String iddd=request.getParameter("id");
		if(iddd=="")iddd="0";
		int id=Integer.parseInt(iddd);
		String semister=request.getParameter("semister");
		String session=request.getParameter("session");
		String ph=request.getParameter("pnum");
		if(ph=="") ph="0";
		int phone=Integer.parseInt(ph);
		String address=request.getParameter("address");
		user.setDp(request.getParameter("dp"));
		user.setName(name);
		user.setId(id);
		user.setSemister(semister);
		user.setSession(session);
		user.setPhone(phone);
		user.setAddress(address);
		AddStrudentService ad=new AddStrudentService();
		PrintWriter out=response.getWriter();
		if(ad.store(user))
		{
			//RequestDispatcher dispatcher= request.getRequestDispatcher("admin.jsp");
			//dispatcher.forward(request, response);
			request.getRequestDispatcher("admin.jsp").include(request, response);
			out.print("You are successfully entered values...");
			
		}
		else {
			RequestDispatcher dispatcher= request.getRequestDispatcher("ErrorAddStudent.jsp");
			dispatcher.forward(request, response);
		}
		
		//System.out.print(id);
		
	}

}
