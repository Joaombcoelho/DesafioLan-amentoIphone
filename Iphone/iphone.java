package Iphone;

public class iphone implements navegador, aparelhoTelefonico, reprodutorMusical {
	
	public static void main(String[] args) {
        iphone iphone = new iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
		
	}
	@Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba Adicionada!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada!");

    }

    @Override
    public void tocar() {
        System.out.println("Música Tocando!");

    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada!");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada!");

    
        }
    }
