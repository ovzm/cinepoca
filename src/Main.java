import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // VAR GLOBAIS
        boolean iniciar = true;
        String nomeTmp = "";
        String senhaTmp = "";
        Pessoa pessoa = new Pessoa();

        // FILMES
        CatalogoFilmes catalogo = new CatalogoFilmes();
//
//        System.out.print("Nome do filme: ");
//        String nome = scanner.nextLine();
//
//        System.out.print("Duração do filme (em minutos): ");
//        int duracao = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Gênero do filme: ");
//        String genero = scanner.nextLine();
//
//        System.out.print("Classificação indicativa: ");
//        String classificacao = scanner.nextLine();
//
//        catalogo.listarFilmes();
//        catalogo.addFilme(nome, duracao, genero, classificacao);
//        System.out.println("Filme adicionado com sucesso!");
        catalogo.listarFilmes();
        catalogo.removerFilme();
        catalogo.listarFilmes();


        // SESSÕES
//        Sessao sessaoC1 = new Sessao(1,"18:00", "Inglês", 30, filme1);
//        Sessao sessaoC2 = new Sessao(2,"20:30", "Português", 30, filme1);
//
//        Sessao sessaoP1 = new Sessao(2,"18:00", "Inglês", 30, filme2);
//        Sessao sessaoP2 = new Sessao(3,"22:00", "Português", 30, filme2);
//
//        Sessao sessaoL1 = new Sessao(3,"19:00", "Português", 30, filme3);
//        Sessao sessaoL2 = new Sessao(1,"21:30", "Inglês", 30, filme3);

        while (iniciar){
            // MENU
            System.out.println("-----CINE POCA-----");
            System.out.println("1-Cadastro");
            System.out.println("2-Login");
            System.out.println("3-Filmes");
            System.out.println("4-Bombo");
            System.out.println("5-Pagar");
            System.out.println("6-Admin");
            System.out.println("0-Sair");

            System.out.println("Escolha uma opção: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1: // CADASTRO
                    int auxiliar = voltarPag();

                    if (auxiliar == 1) {
                        System.out.println("-----CINE POCA-----");
                        System.out.println("Digite seu nome de usuário: ");
                        pessoa.setNome(scanner.next());
                        System.out.println("Digite sua idade: ");
                        pessoa.setIdade(scanner.nextInt());
                        System.out.println("Digite sua senha: ");
                        pessoa.setSenha(scanner.next());
                    } else {
                        break;
                    }
                    break;
                case 2: // LOGIN
                    auxiliar = voltarPag();

                    if (auxiliar == 1) {
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
                    } else {
                        break;
                    }
                    break;
                case 3: // FILMES
                    auxiliar = voltarPag();

                    if (auxiliar == 1) {
                        pessoa.verificarAutenticacao();
                    } else {
                        break;
                    }
                    break;
                case 4: // BOMBO
                    pessoa.verificarAutenticacao();
                    break;
                case 5: // PAGAR
                    pessoa.verificarAutenticacao();
                    break;
                case 6: // ADMIN
                   auxiliar = voltarPag();

                    if (auxiliar == 1) {
                        scanner.nextLine();
                        System.out.println("Digite o usuário: ");
                        String adminDigitado = scanner.nextLine();
                        System.out.println("Digite sua senha: ");
                        String senhaAdminDigitada = scanner.nextLine();

                        if (pessoa.verificarAdmin(adminDigitado, senhaAdminDigitada)) {
                            System.out.println("-----CINE POCA ADMIN-----");
                            System.out.println("1-Administrar Filmes");
                            System.out.println("2-Administrar Sessões");
                            System.out.println("3-Administrar Bombos");
                        } else {
                            System.out.println("Usuário e senha inválidos!");
                        }
                    } else {
                        break;
                    }
                    break;
                case 0: // SAIR
                    System.out.println("Programa Finalizado!");
                    iniciar = false;
                    break;
            }
        }
    }

    public static int voltarPag() {
        System.out.println("-----CINE POCA-----");
        System.out.println("1-Realizar Login");
        System.out.println("2-Voltar");
        int auxiliar = scanner.nextInt();
        if (auxiliar == 1) {
            return auxiliar = 1;
        } else {
            return auxiliar = 0;
        }
    }
}