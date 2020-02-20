package library;

public class Library {
	
	int ID; //From 0 to total-1
	int number_books;
	int days_register;
	int number_books_per_day;
	
	public Library(int ID, int number_books, int days_register, int number_books_per_day){
		this.ID = ID;
		this.number_books = number_books;
		this.days_register = days_register;
		this.number_books_per_day = number_books_per_day;
	}
	
	public int getNumber_books() {
		return number_books;
	}

	public void setNumber_books(int number_books) {
		this.number_books = number_books;
	}

	public int getDays_register() {
		return days_register;
	}

	public void setDays_register(int days_register) {
		this.days_register = days_register;
	}

	public int getNumber_books_per_day() {
		return number_books_per_day;
	}

	public void setNumber_books_per_day(int number_books_per_day) {
		this.number_books_per_day = number_books_per_day;
	}
	
	public static void main(String[] args) {
	
	}
}
