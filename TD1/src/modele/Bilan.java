package modele;

import miscs.Observable;

public class Bilan extends Observable{
	
	public Bilan() {
		super();
		System.out.println("Dans constructeur Bilan");
	}
	
	public void setChange() {
		System.out.println("Dans m�thode setChange... Le bilan est � jour");
	}
	
	
	
}
