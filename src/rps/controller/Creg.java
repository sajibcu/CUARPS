package rps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.CRegM;
import rps.services.CregS;

/**
 * Servlet implementation class Creg
 */
public class Creg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CRegM data=new CRegM();
		data.setId(Integer.parseInt(request.getParameter("ID")));
		data.setCcd(Integer.parseInt(request.getParameter("ccd")));
		CregS cs=new CregS();
		if(cs.save(data))
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
