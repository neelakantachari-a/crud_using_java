package org.kantan.CakeUI;
import java.util.ArrayList;
import java.util.Arrays;

import org.kantan.beans.Cake;
import org.kantan.service.*;

public class CakeUI {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Cake> cakes = new ArrayList<Cake>();
		CakeService cakeDemoObj = new CakeService();
		try{
		cakes=cakeDemoObj.getAllCakes();
		for(int i=0;i<cakes.size(); i++)
		{
			//System.out.println("hello"); 
			System.out.println(cakes.get(i));
			//System.out.println(cakes.get(i).toString());
		}
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
