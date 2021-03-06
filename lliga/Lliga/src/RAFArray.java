import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAFArray<Partit> lliga = new RAFArray<Partit>(10,10,"lliga");
 * Partit partit = new Partit(87,59,"cabr�n","110498");
 * lliga.set(1,2,partit); 	// lliga[1][2]=partit 
 * 
 * ...
 * 
 * Partit aquell_partit = lliga.get(1,2);
 */

/*Es una clase que crea una taula bidimensional i emmagatzemada en un fitxer.*/
public class RAFArray {
	
	/*Crea un RAFArray amb les files i columnes donades i que es guarda en el fitxer*/
	public RAFArray(int filas, int columnas, String nom_fitxer) throws IOException {
		super();
		this.filas = filas;
		this.columnas = columnas;
		fra = new RandomAccessFile (nom_fitxer, "rw");
		fra.writeInt(filas);
		fra.writeInt(columnas);
		
	}
	//Legeix l'array d'un fitxer existent
	public RAFArray(String nom_fitxer) throws IOException {
		File f=new File(nom_fitxer);
		
		if(f.exists()==false)
			throw new FileNotFoundException();
		fra = new RandomAccessFile (nom_fitxer, "rw");
		filas = fra.readInt();
		columnas = fra.readInt();
	}
	
	int columnas;		// Numero total de columens de RAFArray
	int filas;			// Numero total de files de RAFArray
	RandomAccessFile fra;	//Arxiu on es guarda la taula
	
	
	/*Es coloca a la posici� del fitxer donada*/
	private void seek(int fila, int columna, int size) throws IOException {
		boolean columna_malament = columna > columnas;
		boolean fila_malament = fila>filas;
		
		if (columna_malament || fila_malament)
			throw new IndexOutOfBoundsException();
		int posicio = (fila * columnas + columna);
		fra.seek(2*4+posicio*size);
	}
	
	/*Escriu l'element (element) a la fila (fila) i la culumna (columna)*/
	public void set(int fila, int columna, RAFElement element) throws IOException {
		seek(fila,columna,element.size());
		element.write(fra);
	}
	/*Llegeix l'element (element) a la fila (fila) i la culumna (columna)*/
	public void get (int fila, int columna, RAFElement element) throws IOException {
		seek(fila,columna,element.size());
		element.read(fra);
	}

}
