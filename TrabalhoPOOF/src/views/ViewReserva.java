package views;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import models.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ViewReserva implements Observer{
	private ModelReserva model;
	private ViewReservaController controller;
	
	private JFrame frmReservarCarro;
	private JTextField cpf;
	private JTextField nome;
	private JTextField endereco;
	private JTextField email;
	private JButton escolherCarro;
	private JTextField placa;
	private JLabel cpf_txt;
	private JLabel nome_txt;
	private JLabel endereco_txt;
	private JLabel email_txt;
	private JLabel placa_txt;
	private JButton confirmar;
	
	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public ViewReserva() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize(ModelReserva model) {
		this.model = model;
		controller = new ViewReservaController();
		controller.initViewReservaController(model, this);
		menuReserva();
	}
	//Menu da aplicação
	public void menuReserva() {
		frmReservarCarro = new JFrame();
		frmReservarCarro.setTitle("Reservar Carro");
		frmReservarCarro.setBounds(100, 100, 279, 381);
		frmReservarCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReservarCarro.getContentPane().setLayout(null);
		//Tentativa de fazer uma Execessão para impedir que o CPF fique vazio
		try {
		    cpf = new JTextField();
		    cpf.setBounds(85, 40, 85, 20);
		    frmReservarCarro.getContentPane().add(cpf);
		    cpf.setColumns(10);

		    // Verifica se o campo cpf está vazio
		    if (cpf.getText().isEmpty()) {
		        throw new ExceptionCPF("O campo CPF não pode estar vazio.");
		    }

		    // Verifica se o campo cpf tem exatamente 11 dígitos
		    if (cpf.getText().length() != 11) {
		        throw new ExceptionCPF("O CPF deve ter exatamente 11 dígitos.");
		    }

		    // Se chegou aqui, o CPF é válido
		    // Outras ações relacionadas ao CPF podem ser feitas aqui

		} catch (ExceptionCPF e) {
		    // Tratamento da exceção personalizada
		    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro no CPF", JOptionPane.ERROR_MESSAGE);
		}
		
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(85, 70, 85, 20);
		frmReservarCarro.getContentPane().add(nome);
		String nome2 = nome.getText();
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(85, 100, 85, 20);
		frmReservarCarro.getContentPane().add(endereco);
		
		email = new JTextField();
		email.setBounds(85, 130, 85, 20);
		frmReservarCarro.getContentPane().add(email);
		email.setColumns(10);
		
		placa = new JTextField();
		placa.setBounds(85, 161, 86, 20);
		frmReservarCarro.getContentPane().add(placa);
		placa.setColumns(10);
		
		cpf_txt = new JLabel("CPF:");
		cpf_txt.setBounds(29, 43, 46, 14);
		frmReservarCarro.getContentPane().add(cpf_txt);
		
		nome_txt = new JLabel("Nome:");
		nome_txt.setBounds(29, 73, 46, 14);
		frmReservarCarro.getContentPane().add(nome_txt);
		
		endereco_txt = new JLabel("Endereço");
		endereco_txt.setBounds(29, 103, 46, 14);
		frmReservarCarro.getContentPane().add(endereco_txt);
		
		email_txt = new JLabel("E-mail:");
		email_txt.setBounds(29, 133, 46, 14);
		frmReservarCarro.getContentPane().add(email_txt);
		
		placa_txt = new JLabel("Placa:");
		placa_txt.setBounds(29, 164, 46, 14);
		frmReservarCarro.getContentPane().add(placa_txt);
		
		confirmar = new JButton("Confirmar");
		confirmar.setBounds(81, 211, 100, 36);
		frmReservarCarro.getContentPane().add(confirmar);
		
		
		
		 
				
		frmReservarCarro.setVisible(true);
	}
	public JFrame getFrame() {
		return frmReservarCarro;
	}
	public JButton getEscolherCarro() {
		return escolherCarro;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
