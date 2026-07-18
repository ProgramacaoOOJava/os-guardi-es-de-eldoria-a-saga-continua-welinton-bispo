package eldoria;

/**
 * Classe que representa um Mago no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de magia.
 */
public class Mago extends Personagem {
	private int inteligencia;
    
    // * Construtor para criar um Mago.
	public Mago(String nome, String classe, int nivel, int pontoDeVidas, double poderBase, int inteligencia) {
		super(nome, classe, nivel, pontoDeVidas, poderBase);
		this.inteligencia = inteligencia;
	}
	

    /**
     * Sobrescrita do método usarHabilidade() específica para Magos.
     * Demonstra polimorfismo e vinculação dinâmica.
     */
    @Override
    public void usarHabilidade() {
    	System.out.println(getNome() + " ativa sua Habilidade Especial:, Bola de fogo!\n");
    }
}