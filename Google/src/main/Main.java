package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import com.sun.xml.internal.bind.v2.model.core.ID;

import library.Library;
import text.Text;
import methods.Methods;

public class Main {
	static int librarys;
	static int dayscan;
	static ArrayList<Integer> id = new ArrayList<>();
	public static void maxscore(int dayscan, ArrayList<Library> libraries, ArrayList<Integer> score ) {
		ArrayList<Integer> score1 = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < libraries.size(); i++) {
			int daysregst = libraries.get(i).getDays_register();
			int books = libraries.get(i).getNumber_books();
			int booksday = libraries.get(i).getNumber_books_per_day();

			int result = (dayscan-daysregst);
			int daysavailable =books % booksday;
			;
			if( (result - daysavailable) > 0) {
				int havebook=daysavailable * booksday;
				libraries.get(i).setBook(havebook);
				for(int j=0; j<havebook; j++) {
					sum = sum + libraries.get(i).getBooks().get(j).getScore();

				}

			}
			score1.add(sum);
			

		}
		
		for(int k=0; k<libraries.size(); k++) {
			for(int z=0; z<libraries.size(); z++) {
				if(score1.get(k) > score1.get(z)) {
					Collections.swap(libraries, k, z);
				}

			}
		}
		
	
		dayscan =dayscan -libraries.get(1).getDays_register();
		id.add(libraries.get(1).getID());
		
	}

	
	public static void main(String[] args) {

		int librarys;
		int dayscan;
		System.out.println("Hello Google");
		ArrayList<ArrayList<Integer>> linea = new ArrayList<>();
		linea = Text.leerDeFicherosAHashUsuarios();
		Text.formatsplit(linea);
		ArrayList<Integer> datum = Text.getDatum();
		ArrayList<Integer> score = Text.getScore();
		ArrayList<Library> libraries = Text.getLibraries();
		
		System.out.println(datum);
		System.out.println(score);
		

		librarys = datum.get(0);
		dayscan = datum.get(1);
		while(dayscan!=0) {
			maxscore(dayscan, libraries, score);
		}
	
		Methods.output(id, libraries);
		

	}
}
