package task10;

import java.util.Scanner;

public class Q4Account {
	
	double balance;
	double ammount;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Q4Account acc1=new Q4Account();
		System.out.print("Enter deposit amount: ");
		acc1.deposit(sc.nextDouble());
		System.out.print("Enter withdraw amount: ");
		acc1.withdraw(sc.nextDouble());
		System.out.print("Enter balance in account: ");
		Q4Account acc2=new Q4Account(sc.nextDouble(), 0);
		System.out.print("Enter deposit amount: ");
		acc2.deposit(sc.nextDouble());
		System.out.print("Enter withdraw amount: ");
		acc2.withdraw(sc.nextDouble());
		sc.close();
	}
	
	public Q4Account() {
		this.balance=0;
		System.out.println("account balance: "+balance);
		this.ammount=0;
	}
	public Q4Account(double balance,double amount ) {
		if (balance>=0) {
			this.balance=balance;
			System.out.println("account balance: "+balance);
		}else {
			System.out.println("balance can't be negative. Setting balance to 0");
			this.balance=0;
			this.ammount=amount;
		}
		}
	public void deposit(double amount) {
		if (amount>0) {
			this.balance+=amount;
			System.out.println(amount+ " deposit successfully");
			System.out.println("account balance: "+balance);
		}else {
			System.out.println("Invalid amount, Deposit failed");
		}
	}
	public void withdraw(double amount) {
		if(amount>0&&amount<=balance) {
			this.balance-=amount;
			System.out.println(amount+" withdraw successfully");
			System.out.println("account balance: "+balance);
		}else {
			System.out.println("Insufficient funds or invalid amount. Withdraw failed");
		}
	}
}

Output:
account balance: 0.0
Enter deposit amount: 10000
10000.0 deposit successfully
account balance: 10000.0
Enter withdraw amount: 1000
1000.0 withdraw successfully
account balance: 9000.0
Enter balance in account: 1000
account balance: 1000.0
Enter deposit amount: 2000
2000.0 deposit successfully
account balance: 3000.0
Enter withdraw amount: 1000
1000.0 withdraw successfully
account balance: 2000.0