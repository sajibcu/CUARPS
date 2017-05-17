package rps.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.Mentrym;
import rps.services.Mentryservice;

/**
 * Servlet implementation class Mentrys
 */
public class Mentrys extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mentrys() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Mentrym data=new Mentrym();
		data.setId(Integer.parseInt(request.getParameter("id")));
		data.setCcd(Integer.parseInt(request.getParameter("ccd")));
		data.setYr(request.getParameter("yr"));
		data.setMarks(Integer.parseInt(request.getParameter("marks")));
		Mentryservice ms=new Mentryservice();
		
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("teacher.jsp").include(request, response);
		if(ms.save(data))
		{
			out.println("yess!! Marks entry successful!!!!!!");
		}
		else
			out.println("Marks entry Unsuccsessfull!!!!!!!!!!");
		
	}

}
