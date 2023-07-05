package main;
import views.*;
import models.*;
public class Main {
	public static void main(String[] args) {
		Seguro seguro1 = new Seguro();
		seguro1.setContraIncendio(true);
		seguro1.setContraRoubo(true);
		seguro1.setContraColisao(false);
		seguro1.setBlindagem(false);
		
		Seguro seguro2 = new Seguro();
		seguro2.setContraIncendio(false);
		seguro2.setContraRoubo(true);
		seguro2.setContraColisao(true);
		seguro2.setBlindagem(false);
		
		Seguro seguro3 = new Seguro();
		seguro3.setContraIncendio(true);
		seguro3.setContraRoubo(false);
		seguro3.setContraColisao(true);
		seguro3.setBlindagem(true);
		
		Carro carro1 = new Carro();
		carro1.setPlaca("ABC1234");
		carro1.setCor("Vermelho");
		carro1.setRenavam("123456789");
		carro1.setModelo("Sedan");
		carro1.setMarca("Ford");
		carro1.setValor(25000.0f);
		carro1.setCombustivel("Gasolina");
		carro1.setDescricao("Carro confortável e econômico");
		carro1.setDisponivel(true);
		carro1.setDanificado(false);
		carro1.setSeguro(seguro1);

		Carro carro2 = new Carro();
		carro2.setPlaca("DEF5678");
		carro2.setCor("Preto");
		carro2.setRenavam("987654321");
		carro2.setModelo("Hatchback");
		carro2.setMarca("Volkswagen");
		carro2.setValor(30000.0f);
		carro2.setCombustivel("Etanol");
		carro2.setDescricao("Carro esportivo e ágil");
		carro2.setDisponivel(false);
		carro2.setDanificado(true);
		carro2.setSeguro(seguro2);

		Carro carro3 = new Carro();
		carro3.setPlaca("GHI9012");
		carro3.setCor("Branco");
		carro3.setRenavam("543216789");
		carro3.setModelo("SUV");
		carro3.setMarca("Toyota");
		carro3.setValor(40000.0f);
		carro3.setCombustivel("Flex");
		carro3.setDescricao("Carro espaçoso e versátil");
		carro3.setDisponivel(true);
		carro3.setDanificado(false);
		carro3.setSeguro(seguro3);
		Locadora locadora = new Locadora();
		ListaCarros lista = new ListaCarros(3);
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		
		ModelInicio modelo = new ModelInicio();
		ViewInicio view = new ViewInicio();
		view.initialize(modelo);
		
	}
	
}
