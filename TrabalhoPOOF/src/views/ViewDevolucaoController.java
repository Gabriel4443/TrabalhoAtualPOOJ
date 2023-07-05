package views;

import models.*;


public class ViewDevolucaoController {
	private ModelDevolucao model;
	private ViewDevolucao view;
	private Cliente cliente;
	private ListaCarros lista;
	
	public void initializerDevolucao( ModelDevolucao model,ViewDevolucao view) {
		this.model = model;
		this.view = view;
	}
	
	public void handleEvent() {
		if(cliente.getCarroAlugado().getPlaca() == view.getPlaca()) {
			lista.adicionarCarro(cliente.getCarroAlugado(), 0);
		}
	}
}
