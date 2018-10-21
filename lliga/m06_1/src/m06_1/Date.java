package m06_1;

import java.io.File;
import java.io.IOException;

public class Date {
	
	void run () throws IOException {
		
		File arxiu = new File(".");
		
		for (String filename : arxiu.list()) {
			System.out.println(filename);
		}				
	}

}
