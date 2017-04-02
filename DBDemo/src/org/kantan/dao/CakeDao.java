package org.kantan.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.kantan.beans.Cake;
import org.kantan.util.DBConnection;

public class CakeDao {
	
	private String mainTabloe = "cakes";
	
	public ArrayList<Cake> getAllCakes()
	{
		ArrayList<Cake> cakes = new ArrayList<>();
		
		try {
			Connection dbConn = DBConnection.getConnection();		
			String selectCakes = "select * from cakes";
			
			Statement stmt = dbConn.createStatement();
			ResultSet rs=stmt.executeQuery(selectCakes);
			
			while(rs.next())
			{				
				String cakeId=rs.getString("cakeId");
				String cakeName=rs.getString("cakeName");
				Float price=rs.getFloat("price");
				cakes.add(new Cake(cakeId, cakeName, price));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return cakes; 
	}
	
	public boolean createCake()
	{
		// if insert fails
		return false;
	}
	
	public boolean editCake()
	{
		// if insert fails
		return false;
	}
	
	public boolean deleteCake()
	{
		// if insert fails
		return false;
	}
	
	public Cake getCake(int id)
	{
		Cake cake = null;
		return cake;
	}
	
}
