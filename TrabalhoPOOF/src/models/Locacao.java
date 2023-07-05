package models;

public class Locacao {
	//atributos
	private String dataInicio;
	private String dataFinal;
	private Carro carro;
	private Cliente cliente;
	private float valorLocacao;
	
	//Construtor sem parametros

	public Locacao() {
		
	}
	//Construtor sem parametros
	public Locacao(String dataInicio,String dataFinal, Carro carro,Cliente cliente,float valorLocacao) {
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.carro = carro;
		this.cliente = cliente;
		this.valorLocacao = valorLocacao;
	}
	//Get  e Set para a data Inicial
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String datainicio) {
		dataInicio = datainicio;
	}
	//Get  e Set para a data Final
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String datafinal) {
		this.dataFinal = datafinal;
	}
	//Get  e Set para o carro
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro Carro) {
		carro = Carro;
	}
	//Get  e Set para o valor
	public float getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(float ValorLocacao) {
		valorLocacao = ValorLocacao;
	}
	//Função para entregar o carro ao clienete
	public void entregar(ListaCarros lista, Cliente cliente,int carro) {
		
		cliente.setCarroAlugado(lista.getCarro(carro));
		lista.removerCarros(carro);
	}
	//Função de mudar a data final de devolução do carro
	public void renovar(String NovaData) {
		setDataFinal(NovaData);
	}
}
