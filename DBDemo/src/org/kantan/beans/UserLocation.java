package org.kantan.beans;

import java.sql.Date;

public class UserLocation {

	private String userId;
	private String coordinates;
	private Date recordedAt;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	public Date getRecordedAt() {
		return recordedAt;
	}
	public void setRecordedAt(Date recordedAt) {
		this.recordedAt = recordedAt;
	}
	
	public String toString()
	{
		return this.userId +" "+ this.coordinates +" "+ this.recordedAt;
	}
}
