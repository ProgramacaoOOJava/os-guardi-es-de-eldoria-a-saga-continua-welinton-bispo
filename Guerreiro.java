package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {
    private int forca;

    // * Construtor para criar um Guerreiro.
    public Guerreiro(String nome, String classe, int nivel, int pontoDeVidas, double poderBase, int forca) {
        super(nome, classe, nivel, pontoDeVidas, poderBase);
        this.forca = forca;
    }

    /**
     * Sobrescrita do método usarHabilidade() específica para Guerreiros.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " ativa sua Habilidade Especial: Espada Flamejante!\n");
    }

    // Adicionado para garantir o encapsulamento técnico
    public int getForca() {
        return this.forca;
    }

    // Adicionado para exibir a força nos relatórios do reino
    @Override
    public String toString() {
        return super.toString() + " [Força: " + forca + "]";
    }
}

