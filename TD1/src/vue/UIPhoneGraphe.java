package vue;

import interfaces.IObserver;
import miscs.Observable;

public class UIPhoneGraphe implements IObserver {
	
private int num;
	
	public UIPhoneGraphe(int num) {
	System.out.println("Je suis un �cran de type Iphone");
	this.num = num;
}

	public int getNum() {
		return num;
	}
	
	public void UIWindowsGraphe(int num) {
		this.num = num;
	}

	@Override
	public void update(Observable o) {
		System.out.println("Dans m�thode update du IPhoneGraphe n�" + this.num);
		
	}

}
