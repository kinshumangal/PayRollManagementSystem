package com.payrollmanagementsystem;

import java.util.ArrayList;

public class Employer {
	private String companyName;
	private String []locations;
	private String []bands;
	private String []departments;
	public String getCompanyName() {
		return companyName;
	}
	public String[] getLocations() {
		return locations;
	}
	public String[] getBands() {
		return bands;
	}
	public String[] getDepartments() {
		return departments;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setLocations(String[] locations) {
		this.locations = locations;
	}
	public void setBands(String[] bands) {
		this.bands = bands;
	}
	public void setDepartments(String[] departments) {
		this.departments = departments;
	}
	
}
