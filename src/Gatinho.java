// Classe Filha
public class Gatinho extends Animal {
    private String pelagem;

    public Gatinho(String nome, int idade, String cor, String pelagem) {
        super(nome, idade, cor);
        this.pelagem = pelagem;
    }

    public Gatinho() {
        super();
        this.pelagem = "";
    }

    // Getter e Setter para pelagem
    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    // Sobrescrevendo o método mover
    @Override
    public void mover() {
        System.out.println(getNome() + " está caminhando silenciosamente...");
    }

    // Método próprio do gatinho
    public void ronronar() {
        System.out.println(getNome() + " está ronronando!");
    }
}
