package org.kantan.CakeUI;

import java.text.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.*;

import org.kantan.beans.User;
import org.kantan.beans.UserLocation;
import org.kantan.dao.UserLocationDao;
import org.kantan.service.UserLocations;
import org.kantan.service.UsersService;

public class MyApp {

	public static void main(String args[]) {

		UsersService service = new UsersService();

		ArrayList<User> userList = new ArrayList<>();

		userList = service.getAllUserDetails();
		for (User userObj : userList) {
			System.out.println(userObj);
		}

		/*
		 * System.out.println("All users are"); for(User usr:userList)
		 * System.out.println(usr);
		 */
		/*
		 * boolean isDeleted=service.deleteUser("U001"); if(isDeleted)
		 * System.out.println("user details deleted"); else System.out.println(
		 * "Sorry. user doesnot exist");
		 */
		// user.setUserId("U003");
		/*
		 * user.setUserId("U003"); user.setUserName("vatsan");
		 * user.setPassword("123456"); user.setIpAddress("121.172.1.1");
		 * user.setGuardianMobileNo("9964667656"); //service.updateUser(user);
		 */

	}

	public void registerUser() {
		ArrayList<User> userList = new ArrayList<>();
		User user = new User();
		User user1 = new User();
		user.setUserId("U001");
		user.setUserName("Neelakantachari");
		user.setPassword("123456");
		user.setIpAddress("121.172.1.1");
		user.setGuardianMobileNo("9964667656");
		// service.register(user);

		user1.setUserId("U003");
		user1.setUserName("gyanendran");
		user1.setPassword("11111");
		user1.setIpAddress("193.72.11.88");
		user1.setGuardianMobileNo("9900112233");
		// service.register(user1);
		UsersService service = new UsersService();
		user = service.getUserDetails("U003");
		System.out.println("required user details are");
		System.out.println(user);
	}

	public void locationmhod() {
		int choice;
		int repeat = 1;
		User user = new User();

		while (repeat == 1) {
			System.out.println("1.insert locations\n2.show locations\n3.exit makeyour choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				UserLocation location = new UserLocation();
				UserLocations obj = new UserLocations();
				try {
					String input = "06/10/2013 18:29:09";
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
					java.util.Date dt = sdf.parse(input);
					java.sql.Date dtSql = new java.sql.Date(dt.getTime());
					location.setUserId("U009");
					location.setCoordinates("28.123456,-55.453627");
					location.setRecordedAt(dtSql);
					boolean insert = obj.insertLocation(location);// appBoj.userId,appBoj.coordinates,appBoj.recordedAt
					if (insert == true) {
						System.out.println("location inserted successfully");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 2:
				MyApp appBoj = new MyApp();
				UserLocations locs = new UserLocations();
				ArrayList<UserLocation> locList = new ArrayList<>();
				locList = locs.getAllLocations();
				for (UserLocation loc : locList) {
					System.out.println(loc);
				}
				break;

			case 3:
				repeat = 0;
				break;

			default:
				System.out.println("invalid entry. make choice again");

			}
		}
	}
}
