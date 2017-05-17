package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rps.com.Databases;
import rps.model.UserLog;

public class SignUpService{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	public boolean store(UserLog user)
	{
		Databases db=Databases.getinsatance();
		String st="insert into user(name,password,type) values ('"+user.getName()+"','"+user.getPassword()+"','"+user.getType()+"')";    
		//ResultSet rs;
		try {
			statement.execute(st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
			//e.printStackTrace();
		}
		return true;
	}

}
