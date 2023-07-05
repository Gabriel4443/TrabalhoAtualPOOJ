package views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import models.ModelDevolucao;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class ViewDevolucao implements Observer{
	//Modelo da devolução
	private ModelDevolucao model;
	//View da Devolução
	private ViewDevolucaoController controller;
	//Frame da janela
	private JFrame frmDevoluoDoCarro;
	//Textos da tela
	private JTextField cpf_num;
	private JTextField email;
	private JTextField numReserva;
	private JLabel placa_txt;
	private JTextField placa;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the application.
	 */
	public ViewDevolucao() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize(ModelDevolucao model) {
		this.model = model;
		controller = new ViewDevolucaoController();
		controller.initializerDevolucao(model, this);
		menuDevolucao();
	}
	//Menu da aplicação
	public void menuDevolucao() {
		frmDevoluoDoCarro = new JFrame();
		frmDevoluoDoCarro.setTitle("Devolução do Carro");
		frmDevoluoDoCarro.setBounds(100, 100, 310, 340);
		frmDevoluoDoCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDevoluoDoCarro.getContentPane().setLayout(null);
		
		JLabel cpf_txt = DefaultComponentFactory.getInstance().createLabel("CPF: ");
		cpf_txt.setBounds(29, 45, 26, 14);
		frmDevoluoDoCarro.getContentPane().add(cpf_txt);
		
		JLabel email_txt = DefaultComponentFactory.getInstance().createLabel("E-mail: ");
		email_txt.setBounds(29, 75, 40, 14);
		frmDevoluoDoCarro.getContentPane().add(email_txt);
		
		JLabel numeroReserva_txt = DefaultComponentFactory.getInstance().createLabel("Numero da reserva: ");
		numeroReserva_txt.setBounds(29, 105, 104, 14);
		frmDevoluoDoCarro.getContentPane().add(numeroReserva_txt);
		
		cpf_num = new JTextField();
		cpf_num.setBounds(53, 42, 86, 20);
		frmDevoluoDoCarro.getContentPane().add(cpf_num);
		cpf_num.setColumns(10);
		
		email = new JTextField();
		email.setBounds(63, 72, 86, 20);
		frmDevoluoDoCarro.getContentPane().add(email);
		email.setColumns(10);
		
		numReserva = new JTextField();
		numReserva.setBounds(128, 102, 86, 20);
		frmDevoluoDoCarro.getContentPane().add(numReserva);
		numReserva.setColumns(10);
		
		JButton confirmar = new JButton("Confirmar");
		confirmar.setBounds(100, 193, 89, 33);
		frmDevoluoDoCarro.getContentPane().add(confirmar);
		
		placa_txt = new JLabel("Placa:");
		placa_txt.setBounds(29, 130, 46, 14);
		frmDevoluoDoCarro.getContentPane().add(placa_txt);
		
		placa = new JTextField();
		placa.setBounds(63, 127, 86, 20);
		frmDevoluoDoCarro.getContentPane().add(placa);
		placa.setColumns(10);
		confirmar.addActionListener(e -> controller.handleEvent());
		
		frmDevoluoDoCarro.setVisible(true);

	}
	public String getPlaca() {
		String placa = this.placa.getText();
		return placa;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
