import java.io.IOException;
import java.io.RandomAccessFile;

/*Es una interficie que representa un element de la RAFArray*/
public abstract class RAFElement {
	/*Llegeix l'element del arxiu fra*/
	public abstract void read(RandomAccessFile fra) throws IOException;
	/*Escriu l'element al arxiu fra*/
	public abstract void write(RandomAccessFile fra) throws IOException;
	/*Calcula la mida màxima de l'element*/
	public abstract int size();

}
