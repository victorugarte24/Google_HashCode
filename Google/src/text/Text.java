package text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import library.Library;

public class Text {
	
	private static ArrayList<Library> libraries = new ArrayList<>();
	private static ArrayList<Integer> datum = new ArrayList<>();
	private static ArrayList<Integer> score = new ArrayList<>();
	
	
	public static ArrayList<Library> getLibraries() {
		return libraries;
	}

	public static ArrayList<Integer> getDatum() {
		return datum;
	}

	public static ArrayList<Integer> getScore() {
		return score;
	}

	public static ArrayList<ArrayList<Integer>> leerDeFicherosAHashUsuarios() { // Lee usuarios
		ArrayList<ArrayList<Integer>> lin = new ArrayList<>();
		File file = new File("C:\\Users\\Unai\\Documents\\a_example.txt");
	    try {
	      FileReader fr = new FileReader(file);
	      BufferedReader br = new BufferedReader(fr);
	 
	      String linea;
	      while((linea = br.readLine()) != null) {
	    	  ArrayList<Integer> desc = new ArrayList<>();
	    	  for (String value : linea.split(" ")) {  // get list of integer
                  if(!value.equals(""))      {      // ignore space                      
                  desc.add(Integer.parseInt(value));
                  }
                 // add to list
             }
	    	  lin.add(desc);
	      }
	      fr.close();
	    }
	    catch(Exception e) {
	     
	    }
		return lin;
	  }
	
	public static void formatsplit(ArrayList<ArrayList<Integer>> file) {
		
		int idlib=0;
		for(int i=0; i<file.size(); i++ ) {
			
			if(i==0){
				for(int j=0; j<file.get(i).size(); j++) {
					if(j >= 1) {
						datum.add(file.get(i).get(j));
					}
				}
				
			}if(i==1) {
				for(int j=0; j<file.get(i).size(); j++) {
					score.add(file.get(i).get(j));
				}
			}if(i>1) {
				Library library = new Library(idlib, file.get(i).get(0), file.get(i).get(1), file.get(i).get(2), null);
				if(i%2!=0) {
					library.setBooks(file.get(i));
					libraries.add(library);
				}
				
			}
			
		}
		
		
		
	}
}
