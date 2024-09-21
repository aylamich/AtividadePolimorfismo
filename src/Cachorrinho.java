// Classe Filha
public class Cachorrinho extends Animal {
    private String raca;

    public Cachorrinho(String nome, int idade, String cor, String raca) {
        super(nome, idade, cor);
        this.raca = raca;
    }

    public Cachorrinho() {
        super();
        this.raca = "";
    }

    // Getter e Setter para raça
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Sobrescrevendo o método mover
    @Override
    public void mover() {
        System.out.println(getNome() + " está correndo!");
    }

    // Método próprio do cachorrinho
    public void abanarRabo() {
        System.out.println(getNome() + " está abanando o rabinho!");
    }
}
