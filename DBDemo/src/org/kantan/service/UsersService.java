package org.kantan.service;

import java.util.ArrayList;
import org.kantan.beans.User;
import org.kantan.dao.UsersDao;

public class UsersService {



public boolean register(User user ) {
	
	UsersDao userobj=new UsersDao();	
	boolean isRegistered=userobj.register(user);
	return isRegistered;
	}
	
	public User getUserDetails(String userId) {
		UsersDao userobj=new UsersDao();
		User user=userobj.getUserDetails(userId);
		return user;
		}
	
	public ArrayList<User> getAllUserDetails() {
		UsersDao userobj=new UsersDao();
		ArrayList<User> userList=userobj.getAllUserDetails();
		return userList;
	}
	
	public boolean deleteUser(String userId) {
		UsersDao userobj=new UsersDao();
		boolean isDeleted=userobj.deleteUser(userId);
		return isDeleted;
	}
	
	public User updateUser(User user1) {
		UsersDao userobj=new UsersDao();
		Boolean isItUpdated=userobj.updateUser(user1);
		User user=null;
		if(isItUpdated)
			{
				user=userobj.getUserDetails(user1.getUserId());
			}
		return user;
	}

}
