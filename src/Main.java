import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // VAR GLOBAIS
        String nomeTmp = "";
        String senhaTmp = "";
        Pessoa pessoa = new Pessoa();

        // FILMES
        Filme filme1 = new Filme("Creed", 120, "Ação", "+18");

        while (true){
            // MENU
            System.out.println("-----CINE POCA-----");
            System.out.println("1-Cadastro: ");
            System.out.println("2-Login: ");
            System.out.println("3-Filmes: ");
            System.out.println("4-Bombo: ");
            System.out.println("5-Pagar: ");
            System.out.println("0-Sair: ");

            System.out.println("Escolha uma opção: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("-----CINE POCA-----");
                    System.out.println("Digite seu nome de usuário: ");
                    pessoa.setNome(scanner.next());
                    System.out.println("Digite sua idade: ");
                    pessoa.setIdade(scanner.nextInt());
                    System.out.println("Digite sua senha: ");
                    pessoa.setSenha(scanner.next());
                    break;
                case 2:
                    System.out.println("-----CINE POCA-----");
                    scanner.nextLine();
                    System.out.println("Digite seu nome de usuário: ");
                    nomeTmp = scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    senhaTmp = scanner.nextLine();
                    if (pessoa.verificarLogin(nomeTmp, senhaTmp)) {
                        System.out.println("Login realizado com sucesso!");
                        pessoa.setLogado(true);
                    } else {
                        System.out.println("Usuário e senha inválidos!");
                    }
                    break;
                case 3:
                    pessoa.verificarAutenticacao();
                    break;
            }
        }
    }
}