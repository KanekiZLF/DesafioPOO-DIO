public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Teste das funcionalidades
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador");
    }
}
