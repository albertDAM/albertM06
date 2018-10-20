import java.util.List;

public class Persona {

	String nom;
	
	public String saludar(String elteunom) {
	
		return "Hola "+ elteunom + " hem dic " + nom;
	}
	public String saludar(Persona altre) {
		
		//return "Hola "+ altre.nom + " hem dic " + nom;
		return saludar(altre.nom);
	}
	public String saludar(List<Persona> altres) {
		
		String resposta = new String("");
		
		for (Persona persona : altres) {		
			//resposta += "Hola " + persona.nom + " hem dic " + this.nom + "\n";
			resposta += saludar(persona) + "\n";
		}
		
		return resposta;
	}
	
	Persona (String elnom) {
		//this.nom = elnom;
		nom = elnom;
	}
}
