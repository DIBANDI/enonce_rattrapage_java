package fr.miage.m1;

public class Calculateur {
	
	public Calculateur() {
		
	
	}
	

	/**
	 * Retourne l'addition de a+b
	 * @param a
	 * @param b
	 * @return
	 */
	public int addition(int a, int b)  {
		return a*b;
	}
	
	
/**
 * retourne le produit de a*b
 * @param a
 * @param b
 * @return
 */
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	/**
	 * Retourne le resultat de a/b en division entiere
	 * @param a
	 * @param b
	 * @return
	 */
	public int divisionEntiere(int a, int b) {
		return a/b;
	}
	
	/**
	 * Retourne le résultat de a/b en flottant
	 * @param a
	 * @param b
	 * @return
	 */
	public float divisionFlottante(int a, int b) {
		return a/b;
	}
	
}
