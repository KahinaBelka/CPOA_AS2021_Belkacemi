package vue;

import interfaces.IObserver;
import miscs.Observable;

public class UIWindowsGraphe implements IObserver {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public UIWindowsGraphe(int num) {
		System.out.println("Je suis un �cran de type Windows");
		this.num = num;
	}

	@Override
	public void update(Observable o) {
		System.out.println("Dans m�thode update du WindowsGraphe n�" + this.num);
		
	}


	

}
