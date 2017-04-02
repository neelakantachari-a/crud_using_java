package org.kantan.beans;

public class User {

	private String userId;
	private String userName;
	private String password;
	private String ipAddress;
	private String guardianMobileNo;
	
	public String  getUserId() {
		return userId;
	}
	public String  getUserName() {
		return userName;
	}
	public String  getPassword() {
		return password;
	}
	public String  getIpAddress() {
		return ipAddress;
	}
	public String  getGurdianMobileNo() {
		return guardianMobileNo;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public void setGuardianMobileNo(String guardianMobileNo) {
		this.guardianMobileNo = guardianMobileNo;
	}
	
	public String toString(){
		return this.userId+" "+this.userName+" "+this.password+" "+this.ipAddress+" "+this.guardianMobileNo;
	}
}