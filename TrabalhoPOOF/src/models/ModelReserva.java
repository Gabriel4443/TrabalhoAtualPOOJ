package models;

import java.util.ArrayList;

import views.*;

public class ModelReserva {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	
	
	public void attachObserver(Observer observer) {
	        if (observer != null) {
	            observers.add(observer);
	    }
	}



	
}
