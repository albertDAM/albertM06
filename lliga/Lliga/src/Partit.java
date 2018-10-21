import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

public class Partit extends RAFElement{

	public Partit() {
		
		punts_visitant = -1;
		punts_local = -1;
		nom_arbitre = "";
		data = new Date(00,0,0);
		
	};
	
	public int getPunts_visitant() {
		return punts_visitant;
	}

	public void setPunts_visitant(int punts_visitant) {
		this.punts_visitant = punts_visitant;
	}

	public int getPunts_local() {
		return punts_local;
	}

	public void setPunts_local(int punts_local) {
		this.punts_local = punts_local;
	}

	public String getNom_arbitre() {
		return nom_arbitre;
	}

	public void setNom_arbitre(String nom_arbitre) {
		this.nom_arbitre = nom_arbitre;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Partit(int punts_visitant, int punts_local, String nom_arbitre, Date data) {
		super();
		
		if ((punts_visitant > 200) || punts_local > 200 || nom_arbitre.length() > 30 ){
			throw new IllegalArgumentException();
			
		} 
		
		this.punts_visitant = punts_visitant;
		this.punts_local = punts_local;
		this.nom_arbitre = nom_arbitre;
		this.data = data;
	}
	int punts_visitant;	// 1 byte = 8 bits, 2 byte = 16 bits, 3 byte = 24 , 3 char -> 3*4(UTF-32) = 12 byte
	int punts_local;	// 1 byte = 8 bits, 2 byte = 16 bits, 3 byte = 24 , 3 char -> 3*4(UTF-32) = 12 byte
	String nom_arbitre; // 4 bytes/caracter * 30 = 120 bytes
	Date data;          // 4 bytes/caracter * 6 caracter = 24 bytes (YYMMDD)
	

	public String toString() {
		// TODO Auto-generated method stub
		// 0.3 per fer 3 digits (004) + 0.3 per fer 3 digits (006) + 30 caracters + 6 (020518) = 42// 
		String data_string = String.format("%04d/%02d/%02d", 1900+ data.getYear(), 1+data.getMonth(), data.getDate());
		return String.format("%s %d - %d %s", data_string,punts_visitant, punts_local, nom_arbitre);
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (4+4+((30*4)+2)+((8*4)+2));
	}

	/*@Override
	/*public void fromString(String string) {
		punts_visitant = Integer.parseInt(string.substring(0, 2));
		punts_local = Integer.parseInt(string.substring(3, 5));
		nom_arbitre = string.substring(6, 36);
		
		//int year = ?;
		//int month = ?;
		//int day = ?;
		//data = new Date(year,month,day)
	}*/
	
	public void write(RandomAccessFile fra) throws IOException {
		fra.writeInt(punts_visitant);
		fra.writeInt(punts_local);
		fra.writeUTF(nom_arbitre);
		String data_string = String.format("%04d%02d%02d", data.getYear(), data.getMonth(), data.getDate());
		fra.writeUTF(data_string);
	}
	
	public void read(RandomAccessFile fra) throws IOException {
		punts_visitant = fra.readInt();
		punts_local = fra.readInt();
		nom_arbitre = fra.readUTF();
		String data_string = fra.readUTF();
		int year = Integer.parseInt(data_string.substring(0,4));
		int month = Integer.parseInt(data_string.substring(4,6));
		int day = Integer.parseInt(data_string.substring(6,8));
		data = new Date(year, month, day);
	}
	
	
}