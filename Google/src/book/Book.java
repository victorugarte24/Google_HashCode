package book;

public class Book {
	
	int ID; //From 0 to total-1
	int Rate;
	
	public Book(int ID, int Rate) {
		this.ID = ID;
		this.Rate = Rate;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public static void main(String[] args) {

	}

}
