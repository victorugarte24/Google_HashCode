package methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import library.Library;

public class Methods {
	
	
	
	public static void output(ArrayList<Integer> id, ArrayList<Library> librerires) {

	        try (FileWriter writer = new FileWriter("output/output.txt");
	             BufferedWriter bw = new BufferedWriter(writer)) {
	        	
	        	bw.write(id.size());
	            bw.write("/n");
	            for(int a=0;a< librerires.size();a++) {
	            	
	            bw.write(librerires.get(a).getID()+" " +librerires.get(a).getBook());
	            bw.write("/n");
	            for(int b=0; b <librerires.get(a).getBook();b++) {
	            	bw.write(librerires.get(a).getBooks().get(b) + " ");
	            }
	            bw.write("\n");
	            }
	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }
	}

	
}
