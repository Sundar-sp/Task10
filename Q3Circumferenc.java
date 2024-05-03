package task10;

import java.util.Scanner;

public class Q3Circumferenc {

	double radius;
	double pi;
	
	public static void main(String[] args) {
		Q3Circumferenc obj = new Q3Circumferenc();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		Q3Circumferenc obj1 = new Q3Circumferenc(sc.nextDouble(), 3.14);	
		obj.calulateCircumference();
		obj1.calulateCircumference();
		sc.close();
	}
	public Q3Circumferenc(){
		this.radius=0;
		this.pi=3.14;
	}
	public Q3Circumferenc(double radius, double pi) {
		this.radius=radius;
		this.pi = pi;
	}
	public void calulateCircumference() {
		double c = 2*pi*radius;
		System.out.println("Circumferenc of circle is "+c);
	}
}

Output:
Enter Radius: 30
Circumferenc of circle is 0.0
Circumferenc of circle is 188.4

