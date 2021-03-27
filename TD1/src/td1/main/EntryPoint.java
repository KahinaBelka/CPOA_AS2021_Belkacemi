package td1.main;

import td1.miscs.Observable;
import td1.modele.Bilan;
import td1.vue.UIPhoneGraphe;
import td1.vue.UIWindowsGraphe;

@SuppressWarnings("unused")
public class EntryPoint {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("---------");
		//Création du bilan
		Bilan bilan = new Bilan();
		bilan.setNum(1);
		System.out.println("---------");
		//Création du graphe
		UIWindowsGraphe graphe = new UIWindowsGraphe(1);
		UIPhoneGraphe graphe2 = new UIPhoneGraphe(2);
		UIWindowsGraphe graphe3 = new UIWindowsGraphe(3);
		//Je rajoute mon graphe en tant qu'observateur
		//Bilan est observé par graphe
		bilan.addObserver(graphe);
		//Le bilan envoie l'ordre de changement aux observateurs
		bilan.setChange();
		

	}

}
