package rps.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rps.com.Databases;
import rps.model.UserLog;

public class LogInService1 {
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	public int match(UserLog user)
	{
		Databases db=Databases.getinsatance();
		try {
			rs=statement.executeQuery("select * from user");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		try {
			while (rs.next()) {
				if(user.getName().equals(rs.getString("name"))&&user.getPassword().equals(rs.getString("password")))
				{
					if("teacher".equals(rs.getString("type"))||"TEACHER".equals("type"))
							{
						return 1;
							}
					else if("student".equals(rs.getString("type"))||"STUDENT".equals("type"))
							{
						return 2;
							}
					else if("staff".equals(rs.getString("type"))||"STAFF".equals("type"))
							{
						return 3;
							}
					else return 0;
				}
			}

				
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return 0;
		}
		return 0;
	}

}
