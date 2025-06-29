import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoFilmes {
    private ArrayList<Filme> filmesLista;
    static Scanner scanner = new Scanner(System.in);

    public CatalogoFilmes(){
        filmesLista = new ArrayList<>();

        filmesLista.add(new Filme("Creed III", 116, "Drama", "+12"));
        filmesLista.add(new Filme("Pecadores", 137, "Ação, Terror", "+18"));
        filmesLista.add(new Filme("Eu sou a lenda", 100, " Ficção Científica", "+16"));
    }

    public void addFilme(String titulo, int duracao, String genero, String classificacao){
        filmesLista.add(new Filme(titulo, duracao, genero, classificacao));
    }

    public void listarFilmes() {
        for (int i = 0; i < filmesLista.size(); i++) {
            Filme filme = filmesLista.get(i);
            System.out.println("Filme: " + filme.getTitulo() + "| Duração: " + filme.getDuracao() + "| Gênero: " + filme.getGenero() + "| Classificação: " + filme.getClassificacao());
        }
    }

    public void removerFilme() {
        for (int i = 0; i < filmesLista.size(); i++) {
            Filme filme = filmesLista.get(i);
            System.out.println(i + " - Filme: " + filme.getTitulo());
        }
        System.out.println("escolha o filme para remover");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < filmesLista.size()) {
            Filme removido = filmesLista.remove(indice);
            System.out.println("Removido: " + removido.getTitulo());
        } else {
            System.out.println("Índice inválido!");
        }
    }

}
