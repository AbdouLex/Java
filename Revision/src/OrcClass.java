
public class OrcClass {

	public static void main(String[] args) {
		Champions orc = new Champions(100f, 50f, 500f);
		Champions wizard = new Champions("Sahar");
		
		System.out.println("Health of orc = " + orc.getHealth());
		System.out.println("Health of sahar = " + wizard.getHealth());

		orc.setHealth(200);
		System.out.println("Name of orc = " + orc.getName());

		System.out.println("Health of orc = " + orc.getHealth());
	}

}
