package org.kantan.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.util.ArrayList;

import org.kantan.beans.UserLocation;
import org.kantan.dao.UserLocationDao;
import org.kantan.util.DBConnection;

public class UserLocations {
	
	
	public boolean validateAutorizationofUser(String userId)
	{
		return false;
	}
	
	public ArrayList<UserLocation> getAllLocations()
	{
		/*if(!validateAutorizationofUser("User1"))
		{
			return null;
		}*/
		
		// All business logics goes here
		UserLocationDao userLocationDaoobj=new UserLocationDao();
		ArrayList<UserLocation> locList=new ArrayList<>(userLocationDaoobj.getUserLocations());
		return locList;
	}
	
	public boolean insertLocation(UserLocation location)
	{	
		UserLocationDao obj=new UserLocationDao();
		obj.insertLocation(location);
		return true;
	}
	
}
