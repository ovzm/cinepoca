import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Filme filme1 = new Filme("Creed", 120, "Ação", "+18");

        while (true){
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
                    Pessoa pessoa1 = new Pessoa();
                    System.out.println("Digite seu nome de usuário: ");
                    String nomeTmp = scanner.next();
                    pessoa1.setNome(nomeTmp);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    break;
            }

        }
    }
}