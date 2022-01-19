public class Perfil {
    public String nome;
    public int idade;
    public String tipo;
    public int amigos;

    public Perfil(String nome, int idade, String tipo, int amigos) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.amigos = amigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String endereco) {
        this.tipo = endereco;
    }

    public int getAmigos() {
        return amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }
}
