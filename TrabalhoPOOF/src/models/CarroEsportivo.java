package models;

public class CarroEsportivo extends Carro{
	//atributo para carro esportivo
	private String performance;
	//Construtor sem parametros
	public CarroEsportivo() {
		super();
	}
	//Construtor com parametros
	public CarroEsportivo(String performace,String placa, String cor, String renavam, String modelo, String marca, float valor,
			String combustivel, String descricao, boolean disponivel, boolean danificado) {
		super(placa, cor, renavam, modelo, marca, valor, combustivel, descricao, disponivel, danificado);
		this.performance = performace;
	}
	//Set para a performance
	public void setPerformace(String peformace) {
		this.performance = performance;
	}
	//Get para a performance
	public String getPerformace() {
		return performance;
	}
}
