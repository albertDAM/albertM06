import java.util.List;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author ketaminattak
 *
 */

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creem les persones	
		Persona ferran = new Persona("Ferran");
		Persona albert = new Persona("Albert");
		Persona fernando = new Persona("Fernando");
		Persona lolita = new Persona("Lolita");
		
		// Creem la llista de persones
		List<Persona> persones = new ArrayList<Persona>();
		// Afegim les persones a la llista
		persones.add(ferran);
		persones.add(albert);
		persones.add(fernando);
		persones.add(lolita);
		
		/*String contestacio = la_persona.saludar("Albert");
		String contestacio2 = la_persona2.saludar("Lolita");
		System.out.println(contestacio);*/
		
		// L'albert saluda a tots
		String contestacio = albert.saludar(persones);
		System.out.println(contestacio);
		
		// L'albert saluda al ferran 
		contestacio = albert.saludar(ferran);
		System.out.println(contestacio);
	}

}
