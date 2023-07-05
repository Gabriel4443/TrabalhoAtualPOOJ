package models;

public class CarroPopular extends Carro{
	//atributo para carro popular
	private int quantidadeDeVagas;
	//Construtor sem parametros
	public CarroPopular() {
		super();
	}
	//Construtor com parametros
	public CarroPopular(int quantidadeDeVagas,String placa, String cor, String renavam, String modelo, String marca, float valor,
			String combustivel, String descricao, boolean disponivel, boolean danificado) {
		super(placa, cor, renavam, modelo, marca, valor, combustivel, descricao, disponivel, danificado);
		this.quantidadeDeVagas = quantidadeDeVagas;
	}
	//Set para a quantidade de passageiros

	public void setQuantidadeDeVagas(int quantidadeDeVagas) {
		this.quantidadeDeVagas = quantidadeDeVagas;
	}
	//Get para aquantidade de passageiros
	public int getQuantidadeDeVagas(){
		return quantidadeDeVagas;
	}

}
