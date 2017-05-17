package rps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserAddSt;
import rps.services.AddStrudentService;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserAddSt user = null;
		String idd=request.getParameter("id");
		user.setId(Integer.parseInt(idd));
		String pn=request.getParameter("pnum");
		user.setPhone(Integer.parseInt(pn));
		user.setName(request.getParameter("name"));
		user.setSemister(request.getParameter("semister"));
		user.setSession(request.getParameter("session"));
		user.setAddress(request.getParameter("address"));
		AddStrudentService st=new AddStrudentService();
		System.out.print(user.getId());
		if(st.store(user))
		{
			RequestDispatcher dispatcher= request.getRequestDispatcher("addstudent.jsp");
			dispatcher.forward(request, response);
		}
	}

}
