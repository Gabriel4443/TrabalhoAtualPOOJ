package models;

public class Seguro {
	//Atributos
	private boolean contraIncendio;
	private boolean contraRoubo;
	private boolean contraColisao;
	private boolean blindagem;
	
	 // Set para a propriedade contraIncendio
    public void setContraIncendio(boolean contraIncendio) {
        this.contraIncendio = contraIncendio;
    }
    
    // Get para a propriedade contraIncendio
    public boolean getContraIncendio() {
        return contraIncendio;
    }
    
    // Set para a propriedade contraRoubo
    public void setContraRoubo(boolean contraRoubo) {
        this.contraRoubo = contraRoubo;
    }
    
    // Get para a propriedade contraRoubo
    public boolean getContraRoubo() {
        return contraRoubo;
    }
    
    //Set para a propriedade contraColisao
    public void setContraColisao(boolean contraColisao) {
        this.contraColisao = contraColisao;
    }
    
    // Get para a propriedade contraColisao
    public boolean getContraColisao() {
        return contraColisao;
    }
    
    // Set para a propriedade blindagem
    public void setBlindagem(boolean blindagem) {
        this.blindagem = blindagem;
    }
    
    // Get para a propriedade blindagem
    public boolean getBlindagem() {
        return blindagem;
    }
}
