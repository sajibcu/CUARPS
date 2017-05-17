package rps.services;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rps.com.Databases;
import rps.model.UserAddSt;

public class SrcResultSer{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	UserAddSt user1=new UserAddSt();
	ResultSet rs1,rs2;
	public UserAddSt retrive(UserAddSt user)
	{
		Databases db=Databases.getinsatance();
		double gpa=0;
		double cadit=0;
		try {
			rs = statement.executeQuery("select marks.mark,course.ccd from marks,course where marks.ccd=course.id and marks.yr='"+user.getSemister()+"'");
			//rs1 = statment.executeQuery("select * from course");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				
					//System.out.println(rs.getDouble("mark"));
					//user1.setGpa(rs.getDouble("mark"));
					cadit+=rs.getInt("ccd");
					gpa+=rs.getDouble("mark")*rs.getInt("ccd");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//rs=statment.executeQuery("select ");
		/*try {
			rs = statment.executeQuery("select * from marks");
			 //rs1 = statment.executeQuery("select * from course");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int cadit=0;
		double marks=0;
		int temp = 0;
		try {
			while (rs.next()) {
				if(rs.getInt("id")==user.getId()&&rs.getString("yr").equals(user.getSemister()))
				{
					while (rs1.next()) {
						if(rs.getInt("ccd")==rs1.getInt("id"))
						{
							cadit+=rs1.getInt("ccd");
							temp=rs1.getInt("ccd");
							break;
						}
					}
					marks+=(rs.getDouble("mark")*(double)temp);
					//cnt+;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*try {
			rs2 = statment.executeQuery("select * from studentinfo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs2.next()) {
				if(rs2.getInt("id")==user.getId())
				{
					user1.setName(rs2.getString("name"));
					user1.setId(user.getId());
					user1.setDp(rs2.getString("dp"));
					user1.setSemister(rs2.getString("semister"));
					user1.setSession(rs2.getString("session"));
					break;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		if(cadit==0) return user1;
		user1.setGpa(gpa/cadit);
		try {
			rs = statement.executeQuery("select * from studentinfo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				if(rs.getInt("id")==user.getId())
				{
					user1.setName(rs.getString("name"));
					user1.setDp(rs.getString("dp"));
					user1.setId(user.getId());
					user1.setSemister(user.getSemister());
					user1.setSession(rs.getString("session"));
					return user1;
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user1;
		
	}

}
