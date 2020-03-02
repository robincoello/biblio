package be.iccbxl.poo.data;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {

	protected int id; 
	private String name; 
	private int maxBooks; 
	// https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/5013706-decouvrez-la-nouvelle-api-de-gestion-des-dates-de-java-8
	private LocalDate registrationDate; 
	private ArrayList<Books> books;
	
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		this.maxBooks = 3; 
		this.registrationDate = LocalDate.now() ;
		this.books = new ArrayList<Book>();
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public LocalDate getRegistrationDate() {
		return registrationDate;
	}


	public ArrayList<Books> getBooks() {
		return books;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", maxBooks=" + maxBooks + ", registrationDate="
				+ registrationDate + ", books=" + books + "]";
	}
	
	
	

	
	
}
