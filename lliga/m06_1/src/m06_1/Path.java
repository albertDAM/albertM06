package m06_1;

import java.io.File;
import java.io.IOException;

public class Path {
	
	void run () throws IOException {
		
		File arxiu = new File("arxiu");
		System.out.println(arxiu.getAbsolutePath());
		
	}

}
