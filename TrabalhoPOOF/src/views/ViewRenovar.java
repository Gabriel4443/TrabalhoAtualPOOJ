package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import models.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewRenovar implements Observer {
	private ModelRenovar model;
	private ViewRenovarController controller;
	private JFrame frmRenovarDataDe;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public ViewRenovar() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize(ModelRenovar model) {
		this.model = model;
		controller = new ViewRenovarController();
		
		menuDevolucao();
	}
	//Menu da aplicação
	public void menuDevolucao() {
		frmRenovarDataDe = new JFrame();
		frmRenovarDataDe.setTitle("Renovar Data de Devolução");
		frmRenovarDataDe.setBounds(100, 100, 300, 330);
		frmRenovarDataDe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRenovarDataDe.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(100, 55, 86, 20);
		frmRenovarDataDe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton renovar = new JButton("Renovar");
		renovar.setBounds(100, 206, 89, 23);
		frmRenovarDataDe.getContentPane().add(renovar);
		
		
		
		frmRenovarDataDe.setVisible(true);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
