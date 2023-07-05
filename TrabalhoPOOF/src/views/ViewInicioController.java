package views;


import java.awt.event.ActionEvent;

import javax.swing.JButton;

import models.ModelInicio;

public class ViewInicioController implements Observer{
	private ModelInicio model;
	private ViewInicio view;
	
	
	public void initViewInicioController(ModelInicio model,ViewInicio view) {
		this.model = model;
		this.view = view;
	}
	public void handleEvent(ActionEvent event) {
	    JButton botao = view.getBotao(event);

	    if (botao == view.getSair()) {
	        model.handleSairButton(view);
	    } else if (botao == view.getReserva()) {
	        model.handleReservaButton(view.getModelReservar(), view);
	    } else if (botao == view.getRenovar()) {
	        model.handleRenovarButton(view.getModelRenovar(), view);
	    } else if (botao == view.getDevolucao()) {
	        model.handleDevolucaoButton(view.getModelDevolver(), view);
	    }
	}

			
	//@Override
	public void update() {		
		
	}

}
