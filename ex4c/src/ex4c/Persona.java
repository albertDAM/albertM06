package ex4c;

public class Persona {

	String nom;
	int edat;
	
	/** Funció per obtenir el nom
	 * @return the nom El nom de la persona
	 */
	public String getNom() {
		return nom;
	}
	/** Cambia el nom de la persona
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Retorna la edat
	 * @return the edat
	 */
	public int getEdat() {
		return edat;
	}
	/** Cambia l'edat
	 * @param edat the edat to set
	 */
	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", edat=" + edat + "]";
	}
	/** Constructor de la clase Persona
	 * @param nom
	 * @param edat
	 */
	public Persona(String nom, int edat) {
		super();
		this.nom = nom;
		this.edat = edat;
	}
	
	public void wave() {
		System.out.printf("Hola hem dic %s i tinc %d anys\n",nom, edat );
	}
	
}
