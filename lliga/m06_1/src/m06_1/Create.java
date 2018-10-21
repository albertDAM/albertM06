package m06_1;

import java.io.File;
import java.io.IOException;

public class Create {

	void run () throws IOException{		
			File arxiu = new File("arxiu");
			arxiu.createNewFile();
	}

}
