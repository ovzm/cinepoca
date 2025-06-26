import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String senha;
    private int idade;
    private boolean logado = false;
    private String usuarioAdmin = "admin";
    private String senhaAdmin = "abc123";

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificarAdmin(String adminDigitado, String senhaAdminDigitada) {
        if (this.usuarioAdmin != null && this.usuarioAdmin.equals(adminDigitado) &&
                this.senhaAdmin != null && this.senhaAdmin.equals(senhaAdminDigitada)) {
            return true;
        }
        return false;
    }

    public boolean verificarLogin(String nomeDigitado, String senhaDigitada) {
        if (this.nome != null && this.nome.equals(nomeDigitado) &&
                this.senha != null && this.senha.equals(senhaDigitada)) {
            this.logado = true;
            return true;
        }
        return false;
    }

    public boolean verificarAutenticacao() {
        if (!this.logado) {
            System.out.println("Você precisa estar logado para acessar essa opção!");
            return false;
        }
        return true;
    }
}
