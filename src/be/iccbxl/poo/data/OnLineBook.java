package be.iccbxl.poo.data;

public class OnLineBook extends Books {

	private byte maxPeople; 
	private String content;
	
	
	public OnLineBook(int id, String title, String author, short totalPages, String language) {
		
		super(id, title, author, totalPages, language);		
		this.maxPeople = 2;
		this.content = "";
	}


	public byte getMaxPeople() {
		return maxPeople;
	}


	public void setMaxPeople(byte maxPeople) {
		this.maxPeople = maxPeople;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "OnLineBook [maxPeople=" + maxPeople + ", content=" + content + "]";
	}





	
	
}
