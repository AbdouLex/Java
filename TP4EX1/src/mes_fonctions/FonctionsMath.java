package mes_fonctions;

public class FonctionsMath {

		public static int Factoriel(int nombre)
		{
			int fact = 1;
			for(int i = nombre; i >= 1; i--){
				fact = fact*i;
			}
			return fact;
		}
		
		public static float Perimetre(float longeur, float largeur)
		{
			return (longeur + largeur) * 2;
		}
		public static float[] EquationSecond(int a, int b, int c)
		{
			float delta = (float)Math.pow(b, 2) - (4 * a * c);
			
			if(delta > 0)
			{
				float res[] = new float[2];
				float X1 = (float)(-b - Math.sqrt(delta)/ (2 * a));
				res[0] = X1;
				float X2 = (float)(-b + Math.sqrt(delta)/ (2 * a));
				res[1] = X2;
				return res;
			}
			else if(delta < 0)
			{
				System.out.println("Aucune resultat dans |R");
			}
			else if(delta == 0)
			{
				float res[] = new float[1];
				float X1 = (float)(-b/(2 *a));
				res[1] = X1;
				return res;
			}
			return null;
		}
		
}
