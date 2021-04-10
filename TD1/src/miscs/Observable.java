package miscs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import td1.interfaces.IObserver;

public class Observable {
	
	private List<IObserver> observers;
	protected int num;
	
	public List<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public Observable() {
		System.out.println("Dans constructeur de Observable");
		observers = new ArrayList<>();
	}
	

	public void notifyObs() {
		System.out.println("Dans méthode notifyObs");
		for(IObserver iobserver : observers){
			//parcourir la collection
			iobserver.update(this);
		}
		//parcourir la collection avec un itérator
		Iterator<IObserver> it = this.observers.iterator();
		while(it.hasNext()) {
			//Permet de parcourir la liste et de modifier le contenu pendant le parcours
			it.next().update(this);
		}
	}
	
	
	public void addObserver(IObserver o) {
		this.observers.add(o);
	}

	

	
	

}
