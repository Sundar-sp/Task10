package task10;

import java.util.Scanner;

public class Q1PersonRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		sc.close();
		Q1Person obj = new Q1Person(name, age);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	}

}

Output:
Enter name: 
Sundar
Enter age: 
29
Sundar
29
