package org.kantan.beans;

public class Cake {

	private String cakeId;
	private String cakeName;
	private Float price;
	
	public Cake() {	}
	
	public Cake(String id, String name, Float price) {
		this.cakeId = id;
		this.cakeName = name;
		this.price = price;
	}
	
	public String getCakeId() {
		return cakeId;
	}
	public void setCakeId(String cakeId) {
		this.cakeId = cakeId;
	}
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cake [cakeId=" + cakeId + ", cakeName=" + cakeName + ", price=" + price + "]";
	}
}
