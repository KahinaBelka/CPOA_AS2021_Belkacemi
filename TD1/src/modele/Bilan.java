package modele;

import miscs.Observable;

public class Bilan extends Observable{
	
	public Bilan() {
		super();
		System.out.println("Dans constructeur Bilan");
	}
	
	public void setChange() {
		System.out.println("Dans méthode setChange... Le bilan est à jour");
	}
	
	
	
}
