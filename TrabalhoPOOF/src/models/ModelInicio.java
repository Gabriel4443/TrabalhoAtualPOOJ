package models;

import java.util.ArrayList;

import views.*;

public class ModelInicio {
	//Array dos Observers
    private ArrayList<Observer> observers = new ArrayList<Observer>();
//Funções para sair e trocar de tela
    public void handleSairButton(ViewInicio view) {
        view.getFrame().dispose();
    }

    public void handleReservaButton(ModelReserva model, ViewInicio view) {
        ViewReserva tela = new ViewReserva();
        tela.initialize(model);
       
    }

    public void handleRenovarButton(ModelRenovar model, ViewInicio view) {
        ViewRenovar tela = new ViewRenovar();
        tela.initialize(model);
       
    }

    public void handleDevolucaoButton(ModelDevolucao model, ViewInicio view) {
        ViewDevolucao tela = new ViewDevolucao();
        tela.initialize(model);
        
    }
// aplicar um observer
    public void attachObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }
}
