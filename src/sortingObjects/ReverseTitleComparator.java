package sortingObjects;

import java.util.Comparator;

public class ReverseTitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		return b2.getTitle().compareTo(b1.getTitle());
	}

}
