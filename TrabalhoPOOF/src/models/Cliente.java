package models;

public class Cliente {
	//Atributos do cliente
	private long cpf;
	private String nome;
	private String endereco;
	private String email;
	private  Carro carroAlugado;
	
	// Construtor sem parametro
	public Cliente() {
		
	}
	// Construtor com parametro
	 public Cliente(long cpf, String nome, String endereco, String email, Carro carroAlugado) {
	        this.cpf = cpf;
	        this.nome = nome;
	        this.endereco = endereco;
	        this.email = email;
	        this.carroAlugado = carroAlugado;
	    }
	 // Getter e Setter para o atributo cpf
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter para o atributo email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter e Setter para o atributo carroAlugado
    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(Carro carroAlugado) {
        this.carroAlugado = carroAlugado;
    }
    //Fução Devolver carro
    public void devolver() {
    	
    	this.carroAlugado = null;
    }
    //Função calcular multa
    public void calcMulta(Taxas taxa) {
    	if(this.carroAlugado.getDanificado()&& !(this.carroAlugado.getSeguro().getContraColisao())) {
    		taxa.setDanificado(70.93f);
    	}
    }
    //Função para pagar o valor
    public void valorPagar() {
 	
 }
}
