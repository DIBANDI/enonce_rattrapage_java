package fr.miage.m1;

public class ClassePrincipale {

	public ClassePrincipale() {}
	
	public void start() {
		Calculateur c = new Calculateur();
		c.addition(5,6);
		c.multiplication(10,2);
		c.divisionEntiere(10,2);
		c.divisionFlottante(10,3);
	}
	
	public static void main(String[] args) {
		ClassePrincipale cp = new ClassePrincipale();
	}
	
}
