package eldoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");
        
        // Ajustado o nome da lista para minúsculo para evitar conflito com o tipo da Classe
        List<Personagem> personagens = new ArrayList<>();
        
        // Instanciando magos diretamente
        Personagem magoEldoria = new Mago("Eldoria", "Mago", 2, 85, 18.0, 200);
        Personagem magoNoal = new Mago("Noal", "Mago", 1, 65, 15.3, 100); 
        
        // Instanciando guerreiros diretamente
        Personagem guerreiroThophen = new Guerreiro("Thophen", "Guerreiro", 2, 200, 18.5, 150);
        Personagem guerreiroRambo = new Guerreiro("Rambo", "Guerreiro", 1, 60, 12.5, 100);
        
        // Adicionando Magos à lista
        personagens.add(magoEldoria);
        personagens.add(magoNoal);
        
        // Adicionando Guerreiros à lista
        personagens.add(guerreiroRambo);
        personagens.add(guerreiroThophen);
        
        System.out.println("--- Exibindo Guardiões ---");
        for(Personagem p : personagens) {
            System.out.println(p);
            System.out.println();
        }
        
        System.out.println("--- Ativando Habilidades e Verificando Tipos ---");
        // Percorrendo a lista e demonstrando polimorfismo
        for(Personagem p : personagens) {
            p.usarHabilidade(); // Polimorfismo puro em ação
            
            // Verificação do verdadeiro tipo em tempo de execução
            if (p instanceof Mago) {
                Mago mago = (Mago) p;
                // Agora usamos o objeto para provar que temos acesso aos dados do Mago
                System.out.println("-> [Verificação]: Este herói canaliza poder arcano!");
            } else if (p instanceof Guerreiro) {
                Guerreiro guerreiro = (Guerreiro) p;
                System.out.println("-> [Verificação]: Este herói luta no combate corpo a corpo!");
            }
            System.out.println();
        }

        // Teste extra para validar o seu método equals() e hashCode() solicitado no desafio
        System.out.println("--- Teste de Comparação (Equals) ---");
        Personagem cloneMago = new Mago("Eldoria", "Mago", 5, 100, 30.0, 400);
        System.out.println("Mago Original é igual ao Clone? " + magoEldoria.equals(cloneMago));
        System.out.println("Os HashCodes são iguais? " + (magoEldoria.hashCode() == cloneMago.hashCode()));
    }
}
