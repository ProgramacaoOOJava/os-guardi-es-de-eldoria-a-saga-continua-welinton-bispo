package eldoria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe principal que demonstra os conceitos de POO aplicados no sistema de personagens de Eldoria.
 * Demonstra: herança, polimorfismo, encapsulamento, instanceof, equals() e hashCode().
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== BEM-VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha!\n");
        
        // Criando uma lista polimórfica de personagens
        List<Personagem> Personagem = new ArrayList<>();
        //instanciando magos diretamente.
        Personagem magoEldoria = new Mago("Eldoria", "Mago", 2, 85, 18.0, 200);
        Personagem magoNoal = new Mago("Noal", "Mago", 1, 65, 15.3, 100); 
        //instanciando magos diretamente.
        Personagem guerreiroThophen = new Guerreiro("Thophen", "Guerreiro", 2, 200, 18.5, 150);
        Personagem guerreiroRambo = new Guerreiro("Rambo", "Guerreiro", 1, 60, 12.5, 100);
        // Adicionando Magos à lista
        Personagem.add(magoEldoria);
        Personagem.add(magoNoal);
        // Adicionando Guerreiros à lista
        Personagem.add(guerreiroRambo);
        Personagem.add(guerreiroThophen);
        
        System.out.println("--- Exibindo Guardiões ---");
        for(Personagem p : Personagem) {
        	System.out.println(p);
        	System.out.println();
        }
        
        // Percorrendo a lista e demonstrando polimorfismo
        for(Personagem p : Personagem) {
        	p.usarHabilidade();
        	
        	if (p instanceof Mago) {
        		Mago mago = (Mago) p;
        	}
				
			}
        }
}

