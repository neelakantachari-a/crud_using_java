package org.kantan.dao;
import java.sql.*;

import org.kantan.util.DBConnection;
import org.kantan.beans.UserLocation;
import java.util.ArrayList;

public class UserLocationDao {
	ArrayList<UserLocation> locList=new ArrayList<>();
	
	public ArrayList<UserLocation> getUserLocations() {
		
		try{		
			Connection conn=DBConnection.getConnection();
			String getLocSql="select * from locations";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(getLocSql);
			while(rs.next())
			{
					String userId=rs.getString("userId");
					String coordinates=rs.getString("coordinates");
					Date recordedAt=rs.getDate("recordedAt");
					//locList.add(new UserLocation(userId, coordinates, recordedAt));
					UserLocation userLocationObj = new UserLocation();
					//userLocationObj.setUserId(userId);
					userLocationObj.setUserId(rs.getString("userId"));
					userLocationObj.setCoordinates(rs.getString("coordinates"));
					userLocationObj.setRecordedAt(rs.getDate("recordedAt"));
					locList.add(userLocationObj);
			}			
		}catch(Exception e){
				e.printStackTrace();
		}
		return  locList;
	}		
	
	
	public boolean insertLocation(UserLocation location)
	{
		try{
		Connection conn= DBConnection.getConnection();
		String userId=location.getUserId();
		String coordinates=location.getCoordinates();
		Date recordedAt=location.getRecordedAt();
		String insertSql="insert into locations(userId,coordinates,recordedAt) values('"+userId+"','"+coordinates+"','"+recordedAt+"')";
		Statement st=conn.createStatement();
		st.executeUpdate(insertSql);
				}catch(Exception ex){
			ex.printStackTrace();
		}
		return true;
	}
}
