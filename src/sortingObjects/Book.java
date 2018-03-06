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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
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
