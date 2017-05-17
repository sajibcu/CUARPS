package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rps.com.Databases;
import rps.model.UserAddSt;


public class StudentInfoService{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	UserAddSt stinfo;
	public UserAddSt studentinfo(int id)
	{
		Databases db=Databases.getinsatance();
		System.out.println(id);
		try {
			rs =statement.executeQuery("select * from studentinfo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next())
			{
				if(rs.getInt("id")==id)
				{
					//stinfo.setId(id);
					System.out.print(rs.getString("name"));
					/*stinfo.setName(rs.getString("name"));
					stinfo.setSemister(rs.getString("semister"));
					stinfo.setSession(rs.getString("session"));
					stinfo.setPhone(rs.getInt("phone"));
					stinfo.setAddress(rs.getString("address"));
					break;*/
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			rs = statment.executeQuery("select * from studentinfo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next())
			{
				System.out.println(id);
				/*if(rs.getInt("id")==id)
				{
					stinfo.setId(rs.getInt("id"));
					stinfo.setName(rs.getString("name"));
					stinfo.setSemister(rs.getString("semister"));
					stinfo.setSession(rs.getString("session"));
					stinfo.setPhone(rs.getInt("phone"));
					stinfo.setAddress(rs.getString("address"));
					System.out.print(id);
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return stinfo;
		
	}

}
