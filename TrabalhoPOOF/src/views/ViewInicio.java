package views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


import models.*;
import javax.swing.JLabel;

public class ViewInicio implements Observer{
	//Atributos
	private ModelInicio model;
	private ModelReserva modelReservar;
	private ModelRenovar modelRenovar;
	private ModelDevolucao modelDev;
	private ViewInicioController controller;
	
	private JFrame frame;
	private JButton sair;
	private JButton reserva;
	private JButton devolucao;
	private JButton renovar;
	

	/**
	 
	/**
	 * Create the application.
	 */
	public ViewInicio() {
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(ModelInicio model) {
		this.model = model;
		controller = new ViewInicioController();
		controller.initViewInicioController(model, this);
		menuInicio();
	}
	
	//Menu Inicial
		/**
		 * @wbp.parser.entryPoint
		 */
		public void menuInicio() {	
			
			frame = new JFrame();
			frame.setBounds(100, 100, 410, 360);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			sair = new JButton("Sair");
			sair.setBounds(160, 231, 90, 40);			
			
			
			frame.getContentPane().add(sair);
			
			reserva = new JButton("Fazer Reserva");
			reserva.setBounds(128, 128, 150, 40);
			frame.getContentPane().add(reserva);
			
			renovar = new JButton("Renovar");
			renovar.setBounds(216, 180, 90, 40);
			frame.getContentPane().add(renovar);
			
			devolucao = new JButton("Devolução");
			devolucao.setBounds(97, 180, 101, 40);
			frame.getContentPane().add(devolucao);
			
			JLabel lblNewLabel = new JLabel("Locadora");
			lblNewLabel.setBounds(171, 41, 56, 40);
			frame.getContentPane().add(lblNewLabel);
			
			sair.addActionListener(e -> controller.handleEvent(e));
			reserva.addActionListener(e -> controller.handleEvent(e));
			renovar.addActionListener(e -> controller.handleEvent(e));
			devolucao.addActionListener(e -> controller.handleEvent(e));
			
			frame.setVisible(true);
		}

		/**
		 * @wbp.parser.entryPoint
		 */
		public JFrame getFrame() {
			return frame;
		}
		
		public JButton getBotao(ActionEvent event) {
		    JButton botao = (JButton) event.getSource();
		    return botao;
		}

		
		public ModelReserva getModelReservar() {
		
			return modelReservar;
		}
		public ModelRenovar getModelRenovar() {
			return modelRenovar;
		}
		public ModelDevolucao getModelDevolver() {
			return modelDev;
		}
		@Override
		public void update() {
			// TODO Auto-generated method stub
			
		}

		public JButton getSair() {
			
			return sair;
		}

		public JButton getReserva() {
			return reserva;
		}

		public JButton getRenovar() {
			return renovar;
		}

		public JButton getDevolucao() {
			return devolucao;
		}
}
