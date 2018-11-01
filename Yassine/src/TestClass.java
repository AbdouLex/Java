
public class TestClass {

	public static void main(String[] args) {
		
		MyClass orc = new MyClass(200,0,1);
		MyClass wizard = new MyClass(100, 0,1);
		
		wizard.setMana(100);
		wizard.CastSpell();
		
		System.out.println(wizard.mana);

		System.out.println(orc.getHealth());
		
		
		
		
	}

}
