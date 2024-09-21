public class Main {
    public static void main(String[] args) {
       // Criando objetos usando construtor sem parâmetros
        Cachorrinho cachorrinho = new Cachorrinho();
        Gatinho gatinho = new Gatinho();
        Coelhinho coelhinho = new Coelhinho();

        // Definindo valores usando setters
        cachorrinho.setNome("Totó");
        cachorrinho.setIdade(4);
        cachorrinho.setCor("Baunilha");
        cachorrinho.setRaca("Chihuahua");

        gatinho.setNome("Mimi");
        gatinho.setIdade(2);
        gatinho.setCor("Branco");
        gatinho.setPelagem("Longa");

        coelhinho.setNome("Puffy");
        coelhinho.setIdade(1);
        coelhinho.setCor("Branco");
        coelhinho.setCorOrelhas("Pretas");

        System.out.println("Animal: Cachorrinho");
        cachorrinho.mover();
        System.out.println("Animal: Gatinho");
        gatinho.mover();
        System.out.println("Animal: Coelhinho");
        coelhinho.mover();

        // Chamada dos métodos específicos das classes filhas utilizando instanceof e type cast
        if (cachorrinho instanceof Cachorrinho) {
            System.out.println("Método específico do cachorrinho:");
            ((Cachorrinho) cachorrinho).abanarRabo();
        }

        if (gatinho instanceof Gatinho) {
            System.out.println("Método específico do gatinho:");
            ((Gatinho) gatinho).ronronar();
        }

        if (coelhinho instanceof Coelhinho) {
            System.out.println("Método específico do coelhinho:");
            ((Coelhinho) coelhinho).roerCenoura();
        }

        // Chamando o método polimórfico
        System.out.println("Movimentos:");
        executarMovimento(cachorrinho);
        executarMovimento(gatinho);
        executarMovimento(coelhinho);
    }

    // Método que recebe uma referência polimórfica e realiza a chamada sobrescrita
    public static void executarMovimento(Animal animal) {
        animal.mover();
    }
}