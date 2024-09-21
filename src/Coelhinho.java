// Classe Filha
public class Coelhinho extends Animal {
    private String corOrelhas;

    public Coelhinho(String nome, int idade, String cor, String corOrelhas) {
        super(nome, idade, cor);
        this.corOrelhas = corOrelhas;
    }

    public Coelhinho() {
        super();
        this.corOrelhas = "";
    }

    // Getter e Setter para cor orelhas
    public String getCorOrelhas() {
        return corOrelhas;
    }

    public void setCorOrelhas(String corOrelhas) {
        this.corOrelhas = corOrelhas;
    }

    // Sobrescrevendo o método mover
    @Override
    public void mover() {
        System.out.println(getNome() + " está pulando");
    }

    // Método próprio do coelhinho
    public void roerCenoura() {
        System.out.println(getNome() + " está roendo uma cenoura");
    }
}
