import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // VAR GLOBAIS
        boolean iniciar = true;
        String nomeTmp = "";
        String senhaTmp = "";
        Pessoa pessoa = new Pessoa();

        // FILMES
        Filme filme1 = new Filme("Creed III", 116, "Drama", "+12");
        Filme filme2 = new Filme("Pecadores", 137, "Ação, Terror", "+18");
        Filme filme3 = new Filme("Eu sou a lenda", 100, " Ficção Científica", "+16");

        // SESSÕES
        Sessao sessaoC1 = new Sessao(1,"18:00", "Inglês", 30, filme1);
        Sessao sessaoC2 = new Sessao(2,"20:30", "Português", 30, filme1);

        Sessao sessaoP1 = new Sessao(2,"18:00", "Inglês", 30, filme2);
        Sessao sessaoP2 = new Sessao(3,"22:00", "Português", 30, filme2);

        Sessao sessaoL1 = new Sessao(3,"19:00", "Português", 30, filme3);
        Sessao sessaoL2 = new Sessao(1,"21:30", "Inglês", 30, filme3);

        System.out.println(sessaoC1.getNomeDoFilme());

        while (iniciar){
            // MENU
            System.out.println("-----CINE POCA-----");
            System.out.println("1-Cadastro: ");
            System.out.println("2-Login: ");
            System.out.println("3-Filmes: ");
            System.out.println("4-Bombo: ");
            System.out.println("5-Pagar: ");
            System.out.println("6-Admin: ");
            System.out.println("0-Sair: ");

            System.out.println("Escolha uma opção: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1: // CADASTRO
                    System.out.println("-----CINE POCA-----");
                    System.out.println("Digite seu nome de usuário: ");
                    pessoa.setNome(scanner.next());
                    System.out.println("Digite sua idade: ");
                    pessoa.setIdade(scanner.nextInt());
                    System.out.println("Digite sua senha: ");
                    pessoa.setSenha(scanner.next());
                    break;
                case 2: // LOGIN
                    System.out.println("-----CINE POCA-----");
                    scanner.nextLine();
                    System.out.println("Digite seu nome de usuário: ");
                    nomeTmp = scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    senhaTmp = scanner.nextLine();
                    if (pessoa.verificarLogin(nomeTmp, senhaTmp)) {
                        System.out.println("Login realizado com sucesso!");
                    } else {
                        System.out.println("Usuário e senha inválidos!");
                    }
                    break;
                case 3: // FILMES
                    pessoa.verificarAutenticacao();
                    break;
                case 4: // BOMBO
                    pessoa.verificarAutenticacao();
                    break;
                case 5: // PAGAR
                    pessoa.verificarAutenticacao();
                    break;
                case 6: // ADMIN
                    scanner.nextLine();
                    System.out.println("Digite o usuário: ");
                    String adminDigitado = scanner.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senhaAdminDigitada = scanner.nextLine();
                    if (pessoa.verificarAdmin(adminDigitado, senhaAdminDigitada)) {
                        System.out.println("Deu certo");
                    } else {
                        System.out.println("Usuário e senha inválidos!");
                    }
                    break;
                case 0: // SAIR
                    System.out.println("Programa Finalizado!");
                    iniciar = false;
                    break;
            }
        }
    }
}