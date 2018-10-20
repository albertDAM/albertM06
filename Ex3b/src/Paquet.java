
public class Paquet {

	int id;
	double pes;
	double mida;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the pes
	 */
	public double getPes() {
		return pes;
	}
	/**
	 * @param pes the pes to set
	 */
	public void setPes(double pes) {
		this.pes = pes;
	}
	/**
	 * @return the mida
	 */
	public double getMida() {
		return mida;
	}
	/**
	 * @param mida the mida to set
	 */
	public void setMida(double mida) {
		this.mida = mida;
	}
	/**
	 * @param id
	 * @param pes
	 * @param mida
	 */
	public Paquet(int id, double pes, double mida) {
		super();
		this.id = id;
		this.pes = pes;
		this.mida = mida;
	}
	/**
	 * 
	 */
	public Paquet() {
		super();
	}
	
}
