package task10;

public class Q6GreenTea extends Q6BlackTea{
	
	public static void main(String[] args) {
		Q6GreenTea obj= new Q6GreenTea();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();

	}
	public void prepareTea() {
		String GreenTeaSachet="GreenTeaSachet";
		String greenTea=water+GreenTeaSachet;
		System.out.println("Green Tea with "+greenTea+" and boil 5minutes");
	}

}

Output:
Green Tea with WaterGreenTeaSachet and boil 5minutes
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
