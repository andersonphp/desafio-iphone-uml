public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.tocar();
        reprodutorMusical.selecionarMusica("In the end - Link Park");
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender();
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina("https://www.dio.com");
        navegadorInternet.adicionarNovaAba();
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavegadorInternetImpl();

        iPhone meuiPhone = new iPhone(reprodutor, telefone, navegador);

        meuiPhone.usarReprodutorMusical();
        meuiPhone.usarAparelhoTelefonico();
        meuiPhone.usarNavegadorInternet();
    }
}
