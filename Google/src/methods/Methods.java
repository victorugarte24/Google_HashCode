package methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Methods {
	
	public Methods() {
		
	}
	
	public void output() {

	        try (FileWriter writer = new FileWriter("output/output.txt");
	             BufferedWriter bw = new BufferedWriter(writer)) {

	            bw.write("/n");
	            bw.write("/n");

	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }
	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.output();
		System.out.println("g");

	}

}
