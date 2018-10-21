package m06_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex4 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Player jordi = new Player ("Jordi", 4, "point guard", 1.72);
		Player joel = new Player ("Joel", 5, "shooting guard", 1.69);
		
		int a = 5;
		
		Team basquet = new Team ();
		basquet.AddPlayer(jordi);
		basquet.AddPlayer(joel);
	
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("basquet_data"))) {
			
				oos.writeObject(basquet);
			
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("basquet_data"))) {
		
				
				/*Object oisf = ois.readObject();				
				Team llegir = (Team)oisf; */
				
				Team basquet2 = (Team)ois.readObject();
				
				System.out.println(basquet2);
		}
	
	}
	
}
	