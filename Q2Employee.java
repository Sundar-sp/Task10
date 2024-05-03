package task10;

public class Q2Employee {
	int ID;
	String firstName, lastName;
	int salary;
	
	public Q2Employee(int ID, String firstName, String lastName, int salary) {
		this.ID=ID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public int riseSalary(int percentage) {
		salary=salary+(salary*percentage/100);
		return salary;
	}
}
