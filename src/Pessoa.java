public class Pessoa {
    private String nome;
    private String senha;
    private int idade;
    private boolean logado = false;

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
