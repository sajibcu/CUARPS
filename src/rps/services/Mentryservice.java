package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rps.com.Databases;
import rps.model.Mentrym;

public class Mentryservice{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	public boolean save(Mentrym data) {
		int cadit = 0;
		try {
			Databases bd=Databases.getinsatance();
			rs = statement.executeQuery("select course.id,course.ccd from course,coursereg where coursereg.sid='"+data.getId()+"' and coursereg.id=course.id");
		} catch (SQLException e) {
			return false;
			//e.printStackTrace();
		}
	    try {
	    	
			while (rs.next()) {
				if (rs.getInt("id") == data.getCcd())
				{
					cadit = rs.getInt("ccd");
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(cadit==0) return false;
	    double marks=data.getMarks()/cadit*4;
	    if(marks>100) return false;
	    else if(marks>=80) marks=4;
	    else if(marks>=75) marks=3.75;
	    else if(marks>=70) marks=3.50;
	    else if(marks>=65) marks=3.25;
	    else if(marks>=60) marks=3.00;
	    else if(marks>=55) marks=2.75;
	    else if(marks>=50) marks=2.50;
	    else if(marks>=45) marks=2.25;
	    else if(marks>=40) marks=2.00;
	    else marks=0;
	    
		String sql="insert into marks(id,ccd,mark,yr) values('"+data.getId()+"','"+data.getCcd()+"','"+marks+"','"+data.getYr()+"')";
		try {
			statement.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
			//e.printStackTrace();
		}
		//return true;
		
		
	}
	

}
