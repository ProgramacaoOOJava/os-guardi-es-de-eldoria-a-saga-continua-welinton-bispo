package eldoria;

import java.util.Objects;

/**
 * Classe base para representar personagens do reino de Eldoria.
 * Aplica conceitos de encapsulamento, herança e polimorfismo.
 */
public abstract class Personagem {
    // Atributos privados (encapsulamento)
    private String nome;
    private String classe;
    private int nivel;
    private int pontoDeVidas;
    private double poderBase;

    // * Construtor que inicializa todos os atributos do personagem.
    public Personagem(String nome, String classe, int nivel, int pontoDeVidas, double poderBase){
        setNome(nome);
        setClasse(classe);
        setNivel(nivel);
        setPontoDeVidas(pontoDeVidas);
        setPoderBase(poderBase);
    }

    // Getters
    public String getNome() {
        return this.nome;
    }
    
    public String getClasse() {
    	return this.classe;
    }
    
    public int getNivel() {
    	return this.nivel;
    }
    
    public int getPontoDeVidas() {
    	return this.pontoDeVidas;
    }
    
    public double getPoderBase() {
    	return this.poderBase;
    }

    // Setters com validações
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
    }
    
    public void setClasse(String classe) {
        if (classe != null && !classe.trim().isEmpty()) {
            this.classe = classe;
        } else {
            throw new IllegalArgumentException("A classe não pode ser vazia.");
        }
    }
    
    public void setNivel(int nivel) {
        if (nivel > 0) {
            this.nivel = nivel;
        } else {
            throw new IllegalArgumentException("O nível deve ser maior que zero.");
        }
    }    

    // * Criar métodos que define os pontos de vida do personagem.
    public void setPontoDeVidas(int pontoDeVidas) {
        if (pontoDeVidas >= 0) {
            this.pontoDeVidas = pontoDeVidas;
        } else {
            this.pontoDeVidas = 0; // Impede que a vida fique negativa se o dano for alto
        }
    }

    public void setPoderBase(double poderBase) {
        if (poderBase >= 0) {
            this.poderBase = poderBase;
        } else {
            throw new IllegalArgumentException("O poder base não pode ser negativo.");
        }
    }

    /**
     * Criar método que define a habilidade do personagem.
     * Deve ser sobrescrito pelas subclasses para implementar comportamentos específicos.
     */
    
    public abstract void usarHabilidade();

    /**
     * Sobrescrita do método toString() para exibir informações do personagem.
     * @return String formatada com todos os atributos do personagem
     */
    @Override
    public String toString() {
        return "Personagem [" +
                "Nome: " + nome + 
                " | Classe: " + classe + 
                " | Nível: " + nivel + 
                " | Vida: " + pontoDeVidas + 
                " | Poder Base: " + poderBase + 
                "]";
    }

    /**
     * Sobrescrita do método equals() para comparar personagens.
     * Dois personagens são considerados iguais se tiverem o mesmo nome e classe.
     * @param obj Objeto a ser comparado
     * @return true se os personagens forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
    	   if (this == obj) return true;
           if (obj == null || getClass() != obj.getClass()) return false;
           Personagem outro = (Personagem) obj;
           return Objects.equals(nome, outro.nome) && 
                  Objects.equals(classe, outro.classe);
    }

    /**
     * Sobrescrita do método hashCode() para ser consistente com equals().
     * @return Código hash baseado no nome e classe
     */
    @Override
    public int hashCode() {
    	return Objects.hash(nome, classe);
    }
}
