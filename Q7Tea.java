package task10;

public class Q7Tea extends Q6HerbalTea{

	public static void main(String[] args) {
		Q7Tea obj[]=new Q7Tea[5];
		for(int i=0; i<obj.length; i++) {
			obj[i]=new Q7Tea();	
			obj[i].prepareTea();
			obj[i].addMilk();
			obj[i].addSugar();
		}
	}
	public void prepareTea() {
		System.out.println("cold tea with "+basicTea);
	}
}

Output:
cold tea with WaterTeaLeaves
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
cold tea with WaterTeaLeaves
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
cold tea with WaterTeaLeaves
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
cold tea with WaterTeaLeaves
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
cold tea with WaterTeaLeaves
milk tea with WaterTeaLeavesMilk
added sugar with basic tea (WaterTeaLeavesSugar)
