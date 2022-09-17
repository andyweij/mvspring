package demo.spring.beans;


import java.util.Iterator;
import java.util.List;

public class Book {
	private int id;
	private String name;
	private List<String> bookStore;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getBookStore() {
		return bookStore;
	}
	public void setBookStore(List<String> bookStore) {
		this.bookStore = bookStore;
	}
	public Book() {
	}

	public Book(int id, String name, List<String> bookStore) {
		super();
		this.id = id;
		this.name = name;
		this.bookStore = bookStore;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("Stores are:");
		Iterator<String> itr = bookStore.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", bookStore=" + bookStore + "]";
	}
   
}
