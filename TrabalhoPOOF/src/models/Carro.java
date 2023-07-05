package models;

public  class Carro {
	//Atributos gerais de um Carro
	private String Placa;
	private String cor;
	private String renavam;
	private String modelo;
	private String marca;
	protected float valor;
	private String Combustivel;
	private String descricao;
	private boolean disponivel;
	private boolean Danificado;
	private Seguro seguro;
	//Construtor sem Parametros para um Carro
	public Carro() {
		
	}
	//Construtor com Parametros para o carro
	public Carro(String placa, String cor, String renavam, String modelo, String marca, float valor, String combustivel, String descricao, boolean disponivel, boolean danificado) {
        this.Placa = placa;
        this.cor = cor;
        this.renavam = renavam;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
        this.Combustivel = combustivel;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.Danificado = danificado;
    }
	//Set para a placa
	 public String getPlaca() {
	        return Placa;
	    }
	//Get para a placa
	    public void setPlaca(String placa) {
	    	if(placa.length() == 8) {
	        Placa = placa;
	    	}
	    }
	  //Set para a cor
	    public String getCor() {
	        return cor;
	    }
	  //Set para a cor
	    public void setCor(String cor) {
	    	if(cor == "vermelho" || cor == "preto" || cor == "azul" || cor == "cinza") {
	        this.cor = cor;
	    	}
	    }
	  //Get para o renavam
	    public String getRenavam() {
	        return renavam;
	    }
	  //Set para o renavam
	    public void setRenavam(String renavam) {
	        this.renavam = renavam;
	    }
	  //Get para o modelo
	    public String getModelo() {
	        return modelo;
	    }
	  //Set para o modelo
	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	  //Get para a marca
	    public String getMarca() {
	        return marca;
	    }
	  //Set para a marca
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	  //Get para o valor
	    public float getValor() {
	        return valor;
	    }
	  //Set para o valor
	    public void setValor(float valor) {
	        this.valor = valor;
	    }
	  //Get para o combustivel
	    public String getCombustivel() {
	        return Combustivel;
	    }
	  //Set para o combustivel
	    public void setCombustivel(String combustivel) {
	        Combustivel = combustivel;
	    }
	  //Get para a descrição
	    public String getDescricao() {
	        return descricao;
	    }
	  //Set para a descrição
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	  //Get para dizer se o Carro esta disponivel
	    public boolean getDisponivel() {
	        return disponivel;
	    }
	  //Set para dizer se o Carro esta disponivel
	    public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	    }
	  //Get para dizer se o carro ficou danificdo
	    public boolean getDanificado() {
	        return Danificado;
	    }
	  //Set para dizer se o carro ficou danificdo
	    public void setDanificado(boolean danificado) {
	        Danificado = danificado;
	    }
	    //Get para o Seguro
	    public Seguro getSeguro() {
	    	return seguro;
	    }
	    //Set para o Seguro
	    public void setSeguro(Seguro seguro) {
	    	this.seguro = seguro;
	    }
}
