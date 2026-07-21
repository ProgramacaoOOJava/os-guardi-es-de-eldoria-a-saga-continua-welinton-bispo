package eldoria;

public class Mago extends Personagem {
    private int inteligencia;
    
    public Mago(String nome, String classe, int nivel, int pontosDeVidas, double poderBase, int inteligencia) {
        super(nome, classe, nivel, pontosDeVidas, poderBase);
        this.inteligencia = inteligencia;
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " ativa sua Habilidade Especial: Bola de fogo!\n");
    }

    // Adicionado para garantir o encapsulamento técnico
    public int getInteligencia() {
        return this.inteligencia;
    }

    // Adicionado para que a inteligência apareça nos relatórios do reino
    @Override
    public String toString() {
        return super.toString() + " [Inteligência: " + inteligencia + "]";
    }
}
