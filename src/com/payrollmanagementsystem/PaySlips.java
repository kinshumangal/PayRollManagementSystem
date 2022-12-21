package com.payrollmanagementsystem;

//import java.util.Date;
import java.util.*;
public class PaySlips extends Employee{
	private String month;
	private int empId;
	private float messBill;
	private Date date;
	
	public String getMonth() {
		return month;
	}
	public int getEmpId() {
		return empId;
	}
	public float getMessBill() {
		return messBill;
	}
	public Date getDate() {
		return date;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setMessBill(float messBill) {
		this.messBill = messBill;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void paySlip(HashMap<Integer, Employee> database) {
		float ctc=(database.get(getEmpId()).getCtc())*100000.0f;
		float ctcPermonth=ctc/12;
		float basicSalary=(ctcPermonth*60)/100;
		float vpp = (ctcPermonth*30)/100;
		float pf=(ctcPermonth*5)/100;
		float otherAllowance = (ctcPermonth*5)/100;
		float incomeTax=0;
		if(ctc<500000) {
			incomeTax=0;
		}else if(ctc>=500000&&ctc<=1000000) {
			incomeTax=(ctcPermonth*5)/100;
		}else if(ctc>1000000&&ctc<=1500000) {
			incomeTax=(ctcPermonth)/10;
		}else if(ctc>1500000&&ctc<=2000000) {
			incomeTax=(ctcPermonth*15)/100;
		}else {
			incomeTax=(ctcPermonth)/5;
		}
		float grossPay=basicSalary+vpp+pf+otherAllowance;
		float netPay=grossPay-incomeTax-messBill;
//		paySlips.put(month, null)
		System.out.println(month+":");
		System.out.println("	Basic Salary: "+basicSalary);
		System.out.println("	Variable Pay: "+vpp);
		System.out.println("	Provident Fund: "+pf);
		System.out.println("	Other Allowance: "+otherAllowance);
		System.out.println("	Income Tax: "+incomeTax);
		System.out.println("	Mess Bill: "+messBill);
		System.out.println("	Net Pay: "+netPay);
		System.out.println("	Gross Pay: "+grossPay);
		System.out.println();
	}
}
