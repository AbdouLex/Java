package mes_fonctions;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Le factioriel de 5 est egal a: " + FonctionsMath.Factoriel(5));
		
		//Equation de second degré
		for(int i = 0; i < FonctionsMath.EquationSecond(1, 3, 2).length ; i++)
		{
			System.out.println( FonctionsMath.EquationSecond(1, 3, 2)[i]);
		}
		
		System.out.println("Le perimetre d'un rectangle de longeur 2 et largeur 3: " + mes_fonctions.FonctionsMath.Perimetre(2, 3));
	}

}
