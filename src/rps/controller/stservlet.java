package rps.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rps.model.UserAddSt;

/**
 * Servlet implementation class stservlet
 */
public class stservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public stservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/// TODO Auto-generated method stub
		String idd=request.getParameter("id");
		int id=Integer.parseInt(idd);
		//read from data from database
		 String name = null;
		String address=null;
		 String semister = null;
		 String session=null;
		 int flg=0;
		 int phone=0;
		  Connection connection;
			 Statement statment = null;
			 ResultSet rs = null;
			 UserAddSt user=new UserAddSt();
				try {
					Class.forName("com.mysql.jdbc.Driver");
					try{
						connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb","root","s01726056968");
					    statment=connection.createStatement();
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
					} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					rs = statment.executeQuery("select * from studentinfo");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   // UserLog us=new UserLog();
			    try {
					while(rs.next())
					{
						if(rs.getInt("id")==id)
						{
							user.setId(id);
							user.setName(rs.getString("name"));
							user.setSemister(rs.getString("semister"));
							user.setSession(rs.getString("session"));
							user.setPhone(rs.getInt("phone"));
							user.setAddress(rs.getString("address"));
							flg=1;
							break;
						}
					}
			    }
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    // end read data from database
					if(flg==1)
					{
						request.getSession().setAttribute("user", user);
						response.sendRedirect("studentinfodisplay.jsp");
					}

	}
				
	

}
