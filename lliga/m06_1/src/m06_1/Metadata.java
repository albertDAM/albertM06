package m06_1;

import java.io.IOException;

public class Metadata {

	public static void main(String[] args) throws IOException {

		Create c = new Create();
		c.run();
		Length l = new Length();
		l.run();
		Path p = new Path();
		p.run();
		Date d = new Date();
		d.run();

	}

}
