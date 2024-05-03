package task10;

import java.util.Scanner;

public class Q2EmployeeRun extends Q2Employee{

	public Q2EmployeeRun(int ID, String firstName, String lastName, int salary) {
		super(ID, firstName, lastName, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Q2EmployeeRun obj = new Q2EmployeeRun(113, "sundar", "r", 50000);
		obj.getID();
		obj.getName();
		obj.getSalary();
		obj.getAnnualSalary();
		System.out.print("Enter New Salary: ");
		obj.setSalary(sc.nextInt());
		System.out.println("After New Salary");
		obj.getSalary();
		obj.getAnnualSalary();
		System.out.print("Enter Salary Rise Percentage: ");
		obj.riseSalary(sc.nextInt());
		System.out.println("After Salary Rise");
		obj.getSalary();
		obj.getAnnualSalary();
		obj.toString();
		sc.close();
	}
	
	public int getID() {
		System.out.println("id: "+ID);
		return ID;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		System.out.println("Name: "+firstName+" "+lastName);
		return (firstName+" "+lastName);
	}
	public int getSalary() {
		System.out.println("Salary: "+salary);
		return salary;
	}
	public void setSalary(int salary){
		this.salary= salary;
	}
	public int getAnnualSalary() {
		System.out.println("Annual Salary: "+(salary*12));
		return (salary*12);
	}
	public String toString() {
		System.out.println("Employee[id="+ ID +", "+ "name= "+ firstName +" "+ lastName +", "+ "salary= " +salary+"]");
		return ("Employee[]id="+ ID +", "+ "name= "+ firstName +" "+ lastName +", "+ "salary= " +salary);
	}
}

Output:
id: 113
Name: sundar r
Salary: 50000
Annual Salary: 600000
Enter New Salary: 60000
After New Salary
Salary: 60000
Annual Salary: 720000
Enter Salary Rise Percentage: 10
After Salary Rise
Salary: 66000
Annual Salary: 792000
Employee[id=113, name= sundar r, salary= 66000]
