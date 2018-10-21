package m06_1;

import java.io.File;
import java.io.IOException;

public class Length {

		void run () throws IOException {
			File arxiu = new File("arxiu");
			arxiu.length();
			System.out.println(arxiu.length());

	}

}
