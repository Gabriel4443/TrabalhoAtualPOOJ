// Classe Locadora
package models;

public class Locadora {
	//Atributos
	private String nome;
	private long cnpj;
	private int numLocacoes;
	private Locacao[] locacoes;
	//Construtor sem parametros
	public Locadora() {
		
	}
	//Construtor com parametros
	public Locadora(String nome, long cnpj, int numLocacoes, Locacao[] locacoes) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.numLocacoes = numLocacoes;
		this.locacoes = locacoes;
	}
	//Get  e Set para o nome
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  //Get  e Set para o cnpj
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
  //Get  e Set para o nome da Locadora
    public int getNumLocacoes() {
        return numLocacoes;
    }

    public void setNumLocacoes(int numLocacoes) {
        if(!(numLocacoes < 0)){
           this.numLocacoes = numLocacoes;
        }
        return;
    }
  //Get  e Set para as locacoes
    public Locacao[] getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(Locacao[] locacoes) {
        this.locacoes = locacoes;
    }
    
    //Função para registrar uma locação
    public  void registroLocacao(Locacao locacao, int id) {
    	locacoes[id] = locacao;
    	
    }
    //Função para remover uma locação
    public void removerLocacao(int id) {
    	locacoes[id] = null;
    	
    }
}
