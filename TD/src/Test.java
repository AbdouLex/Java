
public class Test {
	public static void main(String []args)
	{
		X.n = 0;
		
		X monobjet1= new X(5);
		System.out.println("n= " + monobjet1.n + " v = " + monobjet1.v);
		X monobjet2 = new X(14);
		System.out.println("n = " + X.n + " v = " + monobjet2.v);
		X monobjet3 = new X(20);
		System.out.println("n = " + X.n + " v = " + monobjet3.v);

	}
}
