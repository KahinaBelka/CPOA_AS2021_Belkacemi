package main;

import miscs.Observable;
import modele.Bilan;
import vue.UIPhoneGraphe;
import vue.UIWindowsGraphe;

@SuppressWarnings("unused")
public class EntryPoint {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("---------");
		//Cr?ation du bilan
		Bilan bilan = new Bilan();
		bilan.setNum(1);
		System.out.println("---------");
		//Cr?ation du graphe
		UIWindowsGraphe graphe = new UIWindowsGraphe(1);
		UIPhoneGraphe graphe2 = new UIPhoneGraphe(2);
		UIWindowsGraphe graphe3 = new UIWindowsGraphe(3);
		//Je rajoute mon graphe en tant qu'observateur
		//Bilan est observ? par graphe
		bilan.addObserver(graphe);
		//Le bilan envoie l'ordre de changement aux observateurs
		bilan.setChange();
		

	}

}
