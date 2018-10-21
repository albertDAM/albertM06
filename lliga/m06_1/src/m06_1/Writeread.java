package m06_1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Writeread {

	public static void main(String[] args) {

		String [] noms = {"John", "Jim", "George"};
		double [] alsades = {85.5, 185.5, 105.5};
		
		for (int i=0; i<noms.length; i++) {
			System.out.printf("%s %.2f \n", noms[i], alsades[i]);
		}
		
		try (FileOutputStream fileOut = new FileOutputStream("pedido.txt")){
			DataOutputStream salido = new DataOutputStream(fileOut);
			
			for (int i=0; i<noms.length; i++) {
				salido.writeUTF(noms[i]);
				salido.writeDouble(alsades[i]);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
