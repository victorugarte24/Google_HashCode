package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import library.Library;
import text.Text;

public class Main {
		
	public static void maxscore(int dayscan, ArrayList<Library> libraries, ArrayList<Integer> score ) {
		
		for(int i=0; i<libraries.size(); i++) {
			int daysregst = libraries.get(i).getDays_register();
			int books = libraries.get(i).getNumber_books();
			int booksday = libraries.get(i).getNumber_books_per_day();
			
			int result = (dayscan-daysregst);
			int daysavailable =books % booksday;
			if( (result - daysavailable) > 0) {
				int havebook=daysavailable * booksday;
				ordenar(libraries.get(i).getBooks());
			}
			}
		
	}
	public static void ordenar(ArrayList<Integer> libros) {
		Collections.sort(libros, Collections.reverseOrder());
		System.out.println(libros);
		
	}
	
public static void main(String[] args) {
		
		int librarys;
		int dayscan;
		System.out.println("Hello Google");
		ArrayList<ArrayList<Integer>> linea = new ArrayList<>();
		linea = Text.leerDeFicherosAHashUsuarios();
		Text.formatsplit(linea);
		ArrayList<Library> libraries = Text.getLibraries();
		ArrayList<Integer> datum = Text.getDatum();
		ArrayList<Integer> score = Text.getScore();
		System.out.println(libraries.toString());
		System.out.println(datum);
		System.out.println(score);
		
		librarys = datum.get(0);
		dayscan = datum.get(1);
		
		maxscore(dayscan, libraries, score);
		
	}
}
