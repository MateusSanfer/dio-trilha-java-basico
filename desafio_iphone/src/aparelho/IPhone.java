package aparelho;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public void ligarIPhone() {
		System.out.println("IPhone ligado... Desbloqueando...");
	}
	
	public void desligarIPhone() {
		System.out.println("IPhone desligado...");
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		 System.out.println("Iniciando correio de voz.");
		
	}

	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música selecionada: " + musica);
		
	}
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música... ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
		
	}

}
