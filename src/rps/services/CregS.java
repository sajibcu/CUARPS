package rps.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import rps.com.Databases;
import rps.model.CRegM;

public class CregS{
	Statement statement=Databases.s;
	ResultSet rs=Databases.rs;
	public boolean save(CRegM data)
	{
		Databases db=Databases.getinsatance();
		try {
			rs = statement.executeQuery("select * from coursereg");
		} catch (SQLException e) {
			return false;
			//e.printStackTrace();
		}
	    try {
			while(rs.next())
			{
				if(data.getId()==rs.getInt("sid")&&data.getCcd()==rs.getInt("id"))
				{
					return false;
				}
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql="insert into coursereg(sid,id) value('"+data.getId()+"','"+data.getCcd()+"')";
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
