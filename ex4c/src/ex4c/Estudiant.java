package ex4c;

public class Estudiant extends Persona {

	 public Estudiant(String nom, int edat, String curs) {
		super(nom, edat);

		this.curs=curs;
	}

	String curs;

	public void wave () {
		System.out.printf("Hola hem dic %s i tinc %d anys i estudio %s \n",nom, edat, curs);
	}
}
