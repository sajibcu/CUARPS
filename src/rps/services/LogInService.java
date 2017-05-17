package rps.services;

import java.sql.SQLException;

import rps.com.DataBase;
import rps.model.UserLog;



public class LogInService extends DataBase {
	public LogInService()
	{
		super();
	}
	public int match(UserLog user)
	{
		 String name;
		    String password;
			name=user.getName();
			password=user.getPassword();
			
			try {
				rs = statment.executeQuery("select * from user");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   // UserLog us=new UserLog();
		    try {
				while(rs.next())
				{
					//String dname=rs.getString("name");
					//String dpassword=rs.getString("password");
					//System.out.println(name+" "+password);
					//System.out.println(dname+" "+dpassword);
					/*if(rs.getString("name")==name)&&(rs.getString("password")==password))
					{
						System.out.print("fuck");
						return true;
					}*/
					if(name.equals(rs.getString("name"))&&password.equals(rs.getString("password")))
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
				//e.printStackTrace();
			}
			return 0;
		   
	}

}
