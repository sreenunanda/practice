package Testcases;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	String empName;
	int empID;
	static ArrayList al = new ArrayList();
	static int count = 0; //to track the no. of employees

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public Employee() {
		
	}
	
	public Employee(String empName, int empID) {
		this.empName=empName;
		this.empID=empID;
	}
	
//	public void putDetails(Employee e) {
//		al.add(e);	
//	}
//	
//	public Employee getDetails(int id) {
//		Employee employee=(Employee)al.get(id);
//		return employee;
//	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		Employee employee=new Employee();
		Employee employee2=new Employee("EmpA", 002);
		Employee employee3=new Employee("EmpB", 001);

		al.add(employee2);
		al.add(employee3);
		Collections.sort(al.toString());
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i).empID);
//		}
		

	}
}
