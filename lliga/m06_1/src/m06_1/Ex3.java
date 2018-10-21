package m06_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {


		final int NUM_ROWS = 12; //rows
		final int NUM_COLS = 4;  //columns
		String[] noms = new String[NUM_ROWS];
		int [] dorsal = new int[NUM_ROWS];
		String[] posicio = new String[NUM_ROWS];
		double[] alsada = new double[NUM_ROWS];


		noms[0] = "Jordi";
		noms[1] = "Joel";
		noms[2] = "Marco";
		noms[3] = "Jonathan";
		noms[4] = "Dani";
		noms[5] = "Cristóbal";
		noms[6] = "Ricard";
		noms[7] = "Pere";
		noms[8] = "Raúl";
		noms[9] = "Miquel";
		noms[10] = "Joan";
		noms[11] = "Miguel";

		dorsal[0] = 4;
		dorsal[1] = 5;
		dorsal[2] = 6;
		dorsal[3] = 7;
		dorsal[4] = 8;
		dorsal[5] = 9;
		dorsal[6] = 10;
		dorsal[7] = 11;
		dorsal[8] = 12;
		dorsal[9] = 13;
		dorsal[10] = 14;
		dorsal[11] = 15;

		posicio[0] = "point guard";
		posicio[1] = "shooting guard";
		posicio[2] = "power forward";
		posicio[3] = "point guard";
		posicio[4] = "center";
		posicio[5] = "small forward";
		posicio[6] = "small forward";
		posicio[7] = "shooting guard";
		posicio[8] = "power forward";
		posicio[9] = "small forward";
		posicio[10] = "center";
		posicio[11] = "power forward";

		alsada[0] = 1.72;
		alsada[1] = 1.69;
		alsada[2] = 1.84;
		alsada[3] = 1.64;
		alsada[4] = 1.74;
		alsada[5] = 1.82;
		alsada[6] = 1.81;
		alsada[7] = 1.78;
		alsada[8] = 1.83;
		alsada[9] = 1.88;
		alsada[10] = 1.82;
		alsada[11] = 1.78; 


		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("team_data"))) {

			for (int i = 0; i < NUM_ROWS; i++) {
				dos.writeUTF(noms[i]);
				dos.writeInt(dorsal[i]);
				dos.writeUTF(posicio[i]);
				dos.writeDouble(alsada[i]);


			}
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("team_data"))) {
			for (int i = 0; i < NUM_ROWS; i++) {
				System.out.printf(" %-16s %-16d %-16s %-16.2f \n",dis.readUTF(), dis.readInt(), dis.readUTF(), dis.readDouble());

			}
		}
	}
}
