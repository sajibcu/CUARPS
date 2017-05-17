package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import rps.com.Databases;
import rps.model.UserAddSt;

public class AddStrudentService{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	public boolean store(UserAddSt user)
	{
		Databases db=Databases.getinsatance();
		String st="insert into studentinfo(id,name,semister,session,phone,address,dp) values ('"+user.getId()+"','"+user.getName()+"','"+user.getSemister()+"','"+user.getSession()+"','"+user.getPhone()+"','"+user.getAddress()+"','"+user.getDp()+"')";    
		//ResultSet rs;
		try {
			//System.out.println("fuck"+user.getPhone());
			statement.execute(st);
			//{
				//return true;
			//}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
			//e.printStackTrace();
		}
		return true;
	}

}
