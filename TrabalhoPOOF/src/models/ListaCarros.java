package models;

public class ListaCarros {
	//atributos
	private int quantidade;
	private  Carro[] carros;
	
	public ListaCarros(int quantidade) {
        if(!(quantidade <0)){
 carros = new Carro[quantidade];
}
	}


	//Set e Get para a quantidade de carros
	public void setQuantidade(int quantiade) {
        if(!(quantidade <0) ){
   this.quantidade = quantidade;
        }
}
	
	public int getQuantidade() {
		return quantidade;
	}
	//Get carro especifico
	public  Carro getCarro(int carro) {
		return carros[carro];
	}
	//função apara ver se o carro est danificado
	public void ConsultarCarro (int posicao) {		
		carros[posicao].getDanificado();			
		
	}
	//Função para adicionar um carro
	public void adicionarCarro(Carro carro,int posicao) {
		carros[posicao] = carro;
	}
	//Função para remover um carro
	public  void removerCarros(int posicao) {
		if(!(carros[posicao].getDanificado())) {
		carros[posicao]=null;
		}else if(carros[posicao].getDanificado()){
			System.out.println("O Carro esta danificado");
		}
	}
	
}
