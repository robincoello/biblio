package be.iccbxl.poo.data;

import java.util.ArrayList;

/**
 * represente la librery
 * Defini par son nom, la liste de livres, et membres
 * 
 * @author robinson
 * @version 0.1
 * @see Book
 * @see Person
 * 
 *
 */
public class MyLibrary {
	/**
	 * Nom de la liblioteque
	 */
	private String name;
	/**
	 * Liste de livres
	 */
	private ArrayList<Books> books;
	/**
	 * Liste de membres
	 */
	private ArrayList<Person> people;
	
	
	/**
	 * Cree un bilbioteque en especifient sont nom
	 * @param name le nom de la bliblioteque
	 */
	public MyLibrary(String name) {
		this.name = name;
		
		this.books = new ArrayList<Books>();
		this.people = new ArrayList<Person>();
	}

/**
 * remvoi el nom de la biblioteque
 * @return name 
 */

	public String getName() {
		return name;
	}
/**
 * Modifie le nom de la biblioteque
 * @param name om de la biblioeque
 */

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Books> getBooks() {
		return books;
	}

	/**
	 * Defini la liste de livres 
	 * @param books liste de livres
	 */
	public void setBooks(ArrayList<Books> books) {
		this.books = books;
	}

	/**
	 * Renvoi la liste de persons
	 * 
	 * @return Liste de persons
	 */
	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

	/**
	 * To string
	 */
	@Override
	public String toString() {
		final int maxLen = 3;
		return "MyLibrary [name=" + name + ", books="
				+ (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ", people="
				+ (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null) + "]";
	} 
	
	
	
	
	
}
