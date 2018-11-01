
public class Rationnel {
	
	int num,den;
	
	public Rationnel(int a, int b)
	{
		num = a;
		den = b;
	}
	public Rationnel(int a)
	{
		den =1;
		num = a;
	}
	
	public Rationnel()
	{
		num = 0;
		den = 1;
	}
	public int getNumerateur()
	{
		return num;
	}
	public int getDenominateur()
	{
		return den;
	}
	public void setNumerateur(int num)
	{
		this.num = num;
	}
	public void setDenominateur(int den)
	{
		this.den = den;
	}
	public Rationnel Plus(Rationnel nbr)
	{
		Rationnel result = new Rationnel();
		if(nbr.den == den)
		{
			result.num = nbr.num + num;
		}
		else if (nbr.den < den){
			result.num = nbr.num * den;
			result.den = den;
			result.num = num + nbr.num;
		}
		return result;
	}
	public Rationnel Fois(Rationnel nbr)
	{
		Rationnel result = new Rationnel();
		
		result.den= den * nbr.den;
		result.num = num * nbr.num;
		
		return result;
	}
	public String toString()
	{
		return num + "/" + den;
	}
	
	public static void main(String[] args) {
		Rationnel a = new Rationnel(1,2);
		Rationnel b = new Rationnel(2);
		Rationnel c = new Rationnel();
		
		System.out.println(a);
		System.out.println(a.getNumerateur());
		System.out.println(a.getDenominateur());
		c.setNumerateur(1);
		c.setDenominateur(5);
		System.out.println(c);
		c = a.Plus(b);
		System.out.println(c);
		c = a.Fois(b);
		System.out.println(c);
		
	}
}
