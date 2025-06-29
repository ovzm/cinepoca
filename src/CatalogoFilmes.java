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

    public void addFilme(){
        System.out.print("Digite o nome do filme: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a duração do filme (em minutos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o gênero do filme: ");
        String genero = scanner.nextLine();

        System.out.print("Digite a classificação indicativa: ");
        String classificacao = scanner.nextLine();

        filmesLista.add(new Filme(nome, duracao, genero, classificacao));
        System.out.println("Filme adicionado com sucesso! " +
                "Deseja ver a lista de filmes?");
        String resposta = scanner.nextLine();
        if (resposta.equals("Sim") || resposta.equals("sim") || resposta.equals("s") || resposta.equals("S")) {
            listarFilmes();
        }
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
