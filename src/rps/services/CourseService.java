package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import rps.com.DataBase;
import rps.com.Databases;
import rps.model.CourseModel;

public class CourseService{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;

	public boolean entry(CourseModel course) {
		// TODO Auto-generated method stub
		String sql="insert into course(id,ctl,ccd) values('"+course.getCid()+"','"+course.getCtl()+"','"+course.getCcd()+"')";
		try {
			statement.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
		//return false;
	}
	

}
