package be.iccbxl.poo.data;

import java.time.LocalDate;

public class Books {
	protected int id; 
	protected String title; 
	protected String Author; 
	protected short totalPages; 
	protected byte loandPeriod; 
	protected double rentalPrice; 
	protected LocalDate borrowingDate; 
	protected String language; 
	protected Person borrower;
	
	
	public Books(int id, String title, String author, short totalPages, String language) {

		this.id = id;
		this.title = title;
		this.Author = author;
		this.totalPages = totalPages;
		this.language = language;
		this.loandPeriod = 14; 
		this.rentalPrice = 1.25;
		this.borrowingDate = null;
		this.borrower = null;
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String author) {
		Author = author;
	}


	public short getTotalPages() {
		return totalPages;
	}


	public void setTotalPages(short totalPages) {
		this.totalPages = totalPages;
	}


	public byte getLoandPeriod() {
		return loandPeriod;
	}


	public void setLoandPeriod(byte loandPeriod) {
		this.loandPeriod = loandPeriod;
	}


	public double getRentalPrice() {
		return rentalPrice;
	}


	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}


	public LocalDate getBorrowingDate() {
		return borrowingDate;
	}


	public void setBorrowingDate(LocalDate borrowingDate) {
		this.borrowingDate = borrowingDate;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public Person getBorrower() {
		return borrower;
	}


	public void setBorrower(Person borrower) {
		this.borrower = borrower;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", Author=" + Author + ", totalPages=" + totalPages
				+ ", loandPeriod=" + loandPeriod + ", rentalPrice=" + rentalPrice + ", borrowingDate=" + borrowingDate
				+ ", language=" + language + ", borrower=" + borrower + "]";
	}



	
}
