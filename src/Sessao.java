public class Sessao{
    public int sala;
    public String horario;
    public String idioma;
    public int preco;
    Filme nomeFilme;

    Sessao(int sala, String horario, String idioma, int preco, Filme nomeFilme){
        this.sala = sala;
        this.horario = horario;
        this.idioma = idioma;
        this.preco = preco;
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDoFilme() {
        return nomeFilme.getTitulo();
    }
}
