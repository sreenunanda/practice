package Testcases;

public class ChildClass extends ParentClass{

	public void overridemethod1() {
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		ChildClass childClass=new ChildClass();
		childClass.overridemethod1();
	}
}
