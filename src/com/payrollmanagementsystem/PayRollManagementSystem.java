package com.payrollmanagementsystem;
import java.text.SimpleDateFormat;
import java.util.*;
public class PayRollManagementSystem {
	public static void displayEmpDetails(int id, Employee emp) {
		System.out.println("==========================================================");
		System.out.println("Employee ID: "+id);
		System.out.println("Name: "+emp.getName());
		System.out.println("Gender: "+emp.getGender());
		System.out.println("Address: "+emp.getHomeAddress());
		System.out.println("Department: "+emp.getDepartment());
		System.out.println("Emplyee Type: "+emp.getEmployeeType());
		System.out.println("Band: "+emp.getBand());
		System.out.println("PF Number: "+emp.getPfNumber());
		System.out.println("Bank Account Number: "+emp.getBankAccountNumber());
		System.out.println("CTC: "+emp.getCtc()+"LPA");
		System.out.println("==========================================================");
		System.out.println();
	}
	public static void modificationDetails(Employee emp) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1. Enter 1 for change Name");
		System.out.println("2. Enter 2 for change Address");
		System.out.println("3. Enter 3 for change Location");
		System.out.println("4. Enter 4 for change Department");
		System.out.println("5. Enter 5 for change Employee type");
		System.out.println("6. Enter 6 for change band");
		System.out.println("7. Enter 7 for change Account Number");
		System.out.println("8. Enter 8 for change CTC");
		int choice = scan.nextInt();
		scan.nextLine();
		switch (choice) {
		case 1:
		{
			System.out.println("Enter new Name");
			String name =scan.nextLine();
			emp.setName(name);
		}
		break;
		case 2:
		{
			System.out.println("Enter your Address");
			System.out.println("--------------------------------------------");
			emp.setHomeAddress();
		}
		break;
		case 3:
		{
			System.out.println("Enter new base location");
			String baseLocation=scan.next();
			emp.setBaseLocation(baseLocation);
		}
		break;
		case 4:
		{
			System.out.println("Enter Department name");
			String department =scan.next();
			emp.setDepartment(department);
		}
		break;
		case 5:
		{
			System.out.println("Enter Employee type");
			String Emptype=scan.next();
			emp.setEmployeeType(Emptype);
		}
		break;
		case 6:
		{
			System.out.println("Enter Band");
			String band =scan.next();
			emp.setBand(band);
		}
		break;
		case 7:
		{
			System.out.println("Enter new Bank Account Numebr");
			String bankAcctNum=scan.next();
			emp.setBankAccountNumber(bankAcctNum);
		}
		break;
		case 8:
		{
			System.out.println("Enter new CTC in Lakhs");
			float ctc=scan.nextFloat();
			emp.setCtc(ctc);
		}
		break;
		default:
			System.out.println("Invalid Input!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employer company = new Employer();
		System.out.println("Enter Companany name");
		company.setCompanyName(scan.nextLine());
		System.out.println("Enter locations name (space saparate) ");
		String locations=scan.nextLine();
		company.setLocations(locations.split(" "));
		System.out.println("Enter bands name (space saparate)");
		String bands=scan.nextLine();
		company.setBands(bands.split(" "));
		System.out.println("Enter Departments name (space saparate)");
		String departments=scan.nextLine();
		company.setDepartments(departments.split(" "));
		HashMap<Integer, Employee>database=new HashMap<Integer, Employee>();
		boolean t=false;
		while(!t) {
			System.out.println("1. Enter 1 for add new user");
			System.out.println("2. Enter 2 for Modify user");
			System.out.println("3. Enter 3 for Remove Employee");
			System.out.println("4. Enter 4 for Search Employee");
			System.out.println("5. Enter 5 for Print all Employee");
			System.out.println("6. Enter 6 for generate pay slip");
			System.out.println("7. Enter 7 for exit");
			int choice =scan.nextInt();
			switch (choice) {
			case 1:
			{
				Employee newEmployee=new Employee();
				scan.nextLine();
				System.out.println("Enter your name");
				String name =scan.nextLine();
				newEmployee.setName(name);
				System.out.println("Enter your gender");
				String gender=scan.nextLine();
				newEmployee.setGender(gender);
				System.out.println("Enter your Address");
				System.out.println("--------------------------------------------");
				newEmployee.setHomeAddress();
				System.out.println("Enter base location");
				String baseLocation=scan.next();
				newEmployee.setBaseLocation(baseLocation);
				newEmployee.setEmployeeID();
				System.out.println("Enter Department name");
				String department =scan.next();
				newEmployee.setDepartment(department);
				System.out.println("Enter Employee type");
				String Emptype=scan.next();
				newEmployee.setEmployeeType(Emptype);
				System.out.println("Enter Band");
				String band =scan.next();
				newEmployee.setBand(band);
				System.out.println("Enter PF Number");
				String pfNum=scan.next();
				newEmployee.setPfNumber(pfNum);
				System.out.println("Enter Bank Account Numebr");
				String bankAcctNum=scan.next();
				newEmployee.setBankAccountNumber(bankAcctNum);
				System.out.println("Enter CTC in Lakhs");
				float ctc=scan.nextFloat();
				newEmployee.setCtc(ctc);
				PaySlips payslip=new PaySlips();
				Date date=new Date();
				SimpleDateFormat formatter=new SimpleDateFormat("MM-yyyy");
				String month=formatter.format(date);
				newEmployee.paySlips.put(month, payslip);
				database.put(Employee.getEmployeeID(), newEmployee);
			}
				break;
			case 2:
			{
				System.out.println("Enter Employee ID");
				int empId=scan.nextInt();
				boolean flag = false;
				for(Map.Entry<Integer, Employee> id:database.entrySet()) {
					if(id.getKey()==empId) {
						flag=true;
						displayEmpDetails(id.getKey(),id.getValue());
						modificationDetails(id.getValue());;
						displayEmpDetails(id.getKey(),id.getValue());
					}
				}
				if(!flag) {
					System.out.println("Employee does not exist.\n");
				}
			}
			break;
			case 3:
			{
				System.out.println("Enter Employee ID");
				int empId=scan.nextInt();
				boolean flag = false;
				for(Map.Entry<Integer, Employee> id:database.entrySet()) {
					if(id.getKey()==empId) {
						flag=true;
						displayEmpDetails(id.getKey(),id.getValue());
						//database.remove(id.getKey());
					}
				}
				if(!flag) {
					System.out.println("Employee does not exist.\n");
				}else {
					database.remove(empId);
				}
			}
			break;
			case 4:
			{
				System.out.println("Enter Employee ID");
				int empId=scan.nextInt();
				boolean flag = false;
				for(Map.Entry<Integer, Employee> id:database.entrySet()) {
					if(id.getKey()==empId) {
						flag=true;
						displayEmpDetails(id.getKey(),id.getValue());
					}
				}
				if(!flag) {
					System.out.println("Employee does not exist.\n");
				}else {
					database.remove((Integer)empId);
				}
			}
			break;
			case 5:
			{
				for(Map.Entry<Integer, Employee> id:database.entrySet()) {
					displayEmpDetails(id.getKey(), id.getValue());
				}
			}
			break;
			case 6:
			{
				PaySlips payslip=new PaySlips();
				System.out.println("Enter month of pay in format of MM-YYYY");
				payslip.setMonth(scan.next());
				System.out.println("Enter Employee ID");
				int empId=scan.nextInt();
				if(database.containsKey(empId)){
					payslip.setEmpId(empId);
				}else {
					System.out.println("Employee does not exist.");
					break;
				}
				
				System.out.println("Enter Mess bill");
				payslip.setMessBill(scan.nextFloat());
				Date date = new Date();
				payslip.setDate(date);
				payslip.paySlip(database);
			}
			break;
			case 7:
				t=true;
				break;
			default:
				System.out.println("Invalid Input!, Try Again\n");
			}
		}
	}

}
