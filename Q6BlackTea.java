package task10;

public class Q6BlackTea extends Q5Tea{

	public static void main(String[] args) {
		Q6BlackTea obj= new Q6BlackTea();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();

	}
	public void prepareTea() {
		super.basicTea=water+teaLeaves+sugar;
		System.out.println("black tea with "+basicTea+" and boil 5minutes");
	}

}

Output:
black tea with WaterTeaLeavesSugar and boil 5minutes
milk tea with WaterTeaLeavesSugarMilk
added sugar with basic tea (WaterTeaLeavesSugarSugar)
