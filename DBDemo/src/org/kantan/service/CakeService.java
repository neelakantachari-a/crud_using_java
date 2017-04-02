package org.kantan.service;
import java.util.*;

import org.kantan.beans.Cake;
import org.kantan.dao.CakeDao;
import org.kantan.util.*;

public class CakeService {
	
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
	
	public ArrayList<Cake> getAllCakes()
	{
		ArrayList<Cake> cakes = new ArrayList<Cake>();
		CakeDao cakeDaoObj = new CakeDao();
		cakes = cakeDaoObj.getAllCakes();
		return cakes;
	}	
}
