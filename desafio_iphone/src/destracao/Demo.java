package destracao;

import aparelho.IPhone;

public class Demo {
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		
		iPhone.ligarIPhone();
		System.out.println("Utilizando o Reprodutor Musical");
		iPhone.selecionarMusica("Posturada");
		iPhone.tocar();
		iPhone.pausar();
		
		System.out.println("Utilizando o Telefone");
		iPhone.ligar("(71)93456-7890");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        
        System.out.println("Utilizando o Navegador");
        iPhone.exibirPagina("www.google.com");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        
        iPhone.desligarIPhone();
	}
}
