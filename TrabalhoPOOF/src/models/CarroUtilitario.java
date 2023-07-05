package models;

public class CarroUtilitario extends Carro{
	//atributo para carro Utilitario
	private float carga;
	public CarroUtilitario() {
		super();
	}
	//Construtor sem parametros
	
	//Construtor com parametros
	public CarroUtilitario(float carga,String placa, String cor, String renavam, String modelo, String marca, float valor,
			String combustivel, String descricao, boolean disponivel, boolean danificado) {
		super(placa, cor, renavam, modelo, marca, valor, combustivel, descricao, disponivel, danificado);
		this.carga = carga;
	}
	//Set para a carga
	public void setCarga(float carga) {
		this.carga = carga;
	}
	//Get para a carga
	public float getCarga() {
		return carga;
	}

}
