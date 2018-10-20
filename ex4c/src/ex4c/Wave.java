package ex4c;

public class Wave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona lapersona = new Estudiant("Albert",30,"Quart");
		Persona lapersona2 = new Estudiant("Fernando",30,"Primer");
		Persona elbecari = new Becari("Ferran", 30, "Cinquè");
		Persona elbecari2 = new Becari("Lolita", 40, "Segon");
		Persona elprofesor = new Profesor("Jose", 30);
		Persona elprofesor2 = new Profesor("Miriam",30);
		
		lapersona.wave();
		lapersona2.wave();
		elbecari.wave();
		elprofesor.wave();
		elprofesor2.wave();
		//*lapersona.setNom("Ferran");
		//*lapersona.wave();
	}

}
