

public class TestRobot {
	

	
	public static void main(String[] args) {

		//Creation de 4 robot
		Robot r1 = new Robot(1, 15, 20);
		Robot r2 = new Robot(4, 20, 15);
		Robot r3= new Robot(3, 21, 45);
		Robot r4 = new Robot(2, 14, 13);
		
		//Avaner les robots
		r1.Avancer();
		r2.Avancer();

		//Premier methode d'afficher "Count"
		System.out.println("Nombres des robots: " + r1.count);
		
		r1.Affiche();
		r2.Affiche();
		r3.Affiche();
		
		//Deuxieme methode
		System.out.println("Nombres des robots: " + Robot.count);

	}

}
