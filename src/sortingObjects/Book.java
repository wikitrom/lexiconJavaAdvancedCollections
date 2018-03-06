package sortingObjects;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class Book implements Comparable<Book> {

	private int id;
	private String title;
	private String author;

	// @Override
	// public int compareTo(Book book) { // compare id field
	// return this.id - book.id;
	// }

	// @Override
	// public int compareTo(Book book) { // compare id field, reverse order
	// return book.getId() - this.id;
	// }

//	@Override
//	public int compareTo(Book book) { // compare title field alphabetically
//		return this.title.compareTo(book.getTitle()); // use String compareTo method
//	}

	@Override
	public int compareTo(Book book) { // compare title field alphabetically, then by author
		int titleResult;
		 titleResult = this.title.compareTo(book.getTitle()); 
		 if (titleResult == 0) {   // same title, compare author
			 return this.author.compareTo(book.getAuthor());
		 }
		 return titleResult;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public String toString() {
		return title + " by " + author;
	}

}
