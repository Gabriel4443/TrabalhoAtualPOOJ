package models;

public class Reserva {
	//Atributos
	private int numeroReserva;
	private Cliente cliente;
	private String nome;
	private long cpf;
	
	//Get e Set para o numero da reserva
	  public void setNumeroReserva(int numeroReserva) {
	        this.numeroReserva = numeroReserva;
	    }
	    
	    public int getNumeroReserva() {
	        return numeroReserva;
	    }
	  //Get e Set para o cliente
	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }
	    
	    public Cliente getCliente() {
	        return cliente;
	    }
	  //Get e Set para o nome do cliente
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public String getNome() {
	        return nome;
	    }
	  //Get e Set para o cpf do cliente
	    public void setCpf(long cpf) {
	        this.cpf = cpf;
	    }
	    
	    public long getCpf() {
	        return cpf;
	    }
}
