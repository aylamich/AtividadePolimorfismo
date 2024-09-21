// Classe Pai
public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String cor;

    // Construtor com parâmetros
    public Animal(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Construtor sem parâmetros
    public Animal() {
        this.nome = "";
        this.idade = 0;
        this.cor = "";
    }

    // Getters e Setters
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método da Classe Pai
    public void emitirSom() {
        System.out.println(nome + " está fazendo um som!");
    }

    // Método que os filhos vão sobrescrever
    public abstract void mover();


}
