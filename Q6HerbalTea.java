package task10;

public class Q6HerbalTea extends Q6GreenTea{

	public static void main(String[] args) {
		Q6HerbalTea obj= new Q6HerbalTea();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();

	}
	public void prepareTea() {
		String fennelSeeds="FennelSeeds";
		String carromSeeds="CarromSeeds";
		String leaves="Mintleaves";
		String herbalTea=water+fennelSeeds+carromSeeds+leaves;
		System.out.println("Herbal Tea with "+herbalTea+" and boil 5minutes");
	}

}

Output:
Herbal Tea with WaterFennelSeedsCarromSeedsMintleaves and boil 5minutes
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
