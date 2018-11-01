

public class TestRobot {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r1 = new Robot(1, 15, 20);
		Robot r2 = new Robot(4, 20, 15);
		Robot r3= new Robot(3, 21, 45);
		Robot r4 = new Robot(2, 14, 13);
		
		r1.Avancer();
		r2.Avancer();
		r1.Affiche();
		
		System.out.println(r1.count);
		r2.Affiche();
		r3.Affiche();
	}

}
