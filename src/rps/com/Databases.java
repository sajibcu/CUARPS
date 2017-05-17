package rps.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databases {
	public Connection c;
	public static Statement s;
	public static ResultSet rs;
	static Databases d=Databases.getinsatance();
	private  Databases()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try{
				c=DriverManager.getConnection("jdbc:mysql://localhost:3306/myprojectdb","root","s01726056968");
			    s=c.createStatement();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	public static Databases getinsatance()
	{
		if(d==null)
			d=new Databases();
		return d;
	}

}
