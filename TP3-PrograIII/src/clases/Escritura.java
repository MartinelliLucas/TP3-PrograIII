package clases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escritura {
	public static void main(String[] args) throws IOException{
		try {
			FileOutputStream fos = new FileOutputStream("Calendario.txt");
			OutputStreamWriter out = new OutputStreamWriter(fos);
			out.write("FECHA 1 \r\n");
			out.write("RIVER - BOCA \r\n");
			out.write("INDEPENDIENTE - RACING \r\n");
			out.write("SAN LORENZO - HURACAN \r\n");
			
			out.write("FECHA 2 \r\n");
			out.write("RIVER - INDEPENDIENTE \r\n");
			out.write("SAN LORENZO - BOCA \r\n");
			out.write("HURACAN - RACING \r\n");
			
			out.write("FECHA 3 \r\n");
			out.write("RIVER - SAN LORENZO \r\n");
			out.write("HURACAN - INDEPENDIENTE \r\n");
			out.write("RACING - BOCA \r\n");
			
			out.write("FECHA 4 \r\n");
			out.write("RIVER - HURACAN \r\n");
			out.write("RACING - SAN LORENZO \r\n");
			out.write("BOCA - INDEPENDIENTE \r\n");
			
			out.write("FECHA 5 \r\n");
			out.write("RIVER - RACING \r\n");
			out.write("BOCA - HURACAN \r\n");
			out.write("INDEPENDIENTE - SAN LORENZO \r\n");
			
			out.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
