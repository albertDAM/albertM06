package m06_1;

import java.io.Serializable;

public class Player implements Serializable {
	
	private String nom;
	private int dorsal;
	private String posicio;
	private double alsada;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDorsal() {
		return dorsal;
	}
	
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getPosicio() {
		return posicio;
	}
	public void setPosicio(String posicio) {
		this.posicio = posicio;
	}
	public double getAlsada() {
		return alsada;
	}
	public void setAlsada(double alsada) {
		this.alsada = alsada;
	}

	public Player(String nom, int dorsal, String posicio, double alsada) {
		super();
		this.nom = nom;
		this.dorsal = dorsal;
		this.posicio = posicio;
		this.alsada = alsada;
	}
	@Override
	public String toString() {
		return String.format(" %-16s %-16d %-16s %-16.2f", nom, dorsal, posicio,alsada);
	}
	
}


