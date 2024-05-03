package task10;

import java.util.Iterator;

public class Q5Tea {
	
	String water, teaLeaves, milk, sugar, basicTea;

	public static void main(String[] args) {
		Q5Tea obj =new Q5Tea();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();
	}
	public Q5Tea() {
		this.water="Water";
		this.teaLeaves="TeaLeaves";
		this.milk="Milk";
		this.sugar="Sugar";
		this.basicTea=water+teaLeaves;
	}
	public void prepareTea() {
		System.out.println("basic tea with "+basicTea);
	}
	public void addMilk() {
		String milkTea=this.basicTea+milk;
		System.out.println("milk tea with "+milkTea);
	}
	public void addSugar() {
		String addSugar=this.basicTea+sugar;
		System.out.println("added sugar with basic tea ("+addSugar+")");
	}
}

Output:
basic tea with WaterTeaLeaves
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)

