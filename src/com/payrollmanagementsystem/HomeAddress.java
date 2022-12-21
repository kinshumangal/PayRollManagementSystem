package com.payrollmanagementsystem;
import java.util.*;
public class HomeAddress{
	private String doorNumber, street, area, city, pinCode, state, homeAddress;
	Scanner scan = new Scanner(System.in);
	public String getDoorNumber() {
		return doorNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getStreet() {
		return street;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String setHomeAddress() {
		System.out.println("Enter Door Number");
		this.doorNumber=scan.nextLine();
		System.out.println("Enter Street name");
		this.street=scan.nextLine();
		System.out.println("Enter Area");
		this.area=scan.nextLine();
		System.out.println("Enter City");
		this.city=scan.nextLine();
		System.out.println("Enter state");
		this.state=scan.nextLine();
		System.out.println("Enter Pin Code");
		this.pinCode=scan.nextLine();
		this.homeAddress=this.doorNumber+", "+this.street+", "+this.area+"\n "+this.city+"\n"+this.state+"\n"+this.pinCode;
		return homeAddress;
	}

}
