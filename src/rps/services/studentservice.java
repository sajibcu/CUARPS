package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import rps.com.Databases;
import rps.model.UserAddSt;

public class studentservice{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	public UserAddSt retrive(int id)
	{
		Databases db=Databases.getinsatance();
		UserAddSt user =new UserAddSt();
		try {
			rs = statement.executeQuery("select * from studentinfo");
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
					user.setDp(rs.getString("dp"));
					//flg=1;
					break;
				}
			}
	    }
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return user;
	}

}
