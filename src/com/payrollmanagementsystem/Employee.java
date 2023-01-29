package com.payrollmanagementsystem;

import java.util.HashMap;

public class Employee extends HomeAddress{
	private String name, gender, baseLocation, department, employeeType, band, pfNumber, 
	bankAccountNumber;
	private float ctc;
	private static int employeeID = 212000;
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmployeeType() {
		return this.employeeType;
	}

	public String getBand() {
		return band;
	}

	public String getPfNumber() {
		return pfNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public float getCtc() {
		return ctc;
	}

	public static int getEmployeeID() {
		return employeeID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public void setPfNumber(String pfNumber) {
		this.pfNumber = pfNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public void setCtc(float ctc) {
		this.ctc = ctc;
	}

	public static void setEmployeeID(int employeeID) {
		Employee.employeeID = employeeID;
	}

	public static void setEmployeeID() {
		employeeID = employeeID+1;
	}
	HashMap<String, PaySlips> paySlips=new HashMap<>();
	
}
