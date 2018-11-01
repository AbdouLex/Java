
public class MotDict {
	private String mot;
	private String definition;
	
	public String getMot()
	{
		return mot;
	}
	public String getDefinition()
	{
		return definition;
		
	}
	public void setDefinition(String def)
	{
		definition = def;
		
	}
	public void setMot(String mot)
	{
		this.mot = mot;
	}
	public MotDict()
	{
		this.mot = null;
		this.definition = null;
		
	}
	public MotDict(String mot, String definition)
	{
		this.mot = mot;
		this.definition = definition;
	}
	public boolean Synonyme(MotDict mot)
	{
		
		if(this.mot.compareTo(mot.getMot()) == 0)
			
		{
			return true;
		}
		else 
			return false;
	}
}
