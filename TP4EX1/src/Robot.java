
public class Robot {

	private int oriontation;
	private float abs;
	private float ord;
	static int count =0;
	private int num;
	
	
	public void Avancer()
	{
		switch (oriontation)
		{
			//Oriontation vers le nord
			case 1:
				ord++;
				break;
				
			//Oriontation vers le est
			case 2:
				abs++;
				
				break;
				
			//Oriontation vers le sud
			case 3:
				ord--;
				break;
				
			//Oriontation vers le west
			case 4:
				abs--;
				break;
		}
	}
	
	public void Avancer(int a)
	{
		//Oriontation vers le nord
		switch (oriontation)
		{
			case 1:
				ord += a;
				break;
				
			//Oriontation vers le est
			case 2:
				abs += a;
				
				break;
				
			//Oriontation vers le sud
			case 3:
				ord -= a;
				break;
				
			//Oriontation vers le west
			case 4:
				abs -= a;
				break;
		}
	}
	
	
	public void Tourner()
	{
		switch(oriontation)
		{
			case 1:
				oriontation = 2;
				break;
			case 2:
				oriontation = 3;
				break;
			case 3:
				oriontation = 4;
				break;
			case 4:
				oriontation = 1;
				break;
			
		}
		
	}
	public void Affiche()
	{
		System.out.println(toString());
	}
	public String toString()
	{
		String orion ="";
		switch (oriontation)
		{
			case 1:
				orion = "Nord";
				break;
			case 2:
				orion ="Est";
				break;
			case 3:
				orion = "Sud";
				break;
			case 4:
				orion = "West";
				break;
		}
		return "Robot numero: "+ num +  "\nL'oriontation du robot: " + orion + "\nLa position du robot sur l'axe x: " + abs + "\nLa position du robot sur l'axe y: " + ord;
	}
	
	public Robot(int oriontation, float abs, float ord)
	{

		this.count++;
		this.num = count;
		this.oriontation = oriontation;
		this.abs = abs;
		this.ord = ord;
	}


}
