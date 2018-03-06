package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import performance.TitleSort;

public class Main {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "The Lord of the Rings", "J. R. R. Tolkien"));
		books.add(new Book(2, "Le Petit Prince", "Antoine de Saint-Exupery"));
		books.add(new Book(3, "Harry Potter and the Philosopher's Stone", "J. K. Rowling"));
		books.add(new Book(4, "And Then There Were None", "Agatha Christie"));
		books.add(new Book(5, "Dream of the Red Chamber", "Cao Xueqin"));
		books.add(new Book(6, "The Hobbit", "J. R. R. Tolkien"));
		books.add(new Book(7, "She: A History of Adventure", "H. Rider Haggard"));
		books.add(new Book(8, "The Lion, the Witch and the Wardrobe", "C. S. Lewis"));
		books.add(new Book(9, "The Da Vinci Code", "Dan Brown"));
		books.add(new Book(10, "The Catcher in the Rye", "J. D. Salinger"));
		books.add(new Book(11, "The Hobbit", "AB Svenska Ord"));

		System.out.println();
		System.out.println("Unsorted Books, as stored in ArrayList.");
		System.out.println("=========================================");
		for (Book nextBook : books) {
			System.out.println(nextBook);
		}

		// Sort using defined Comparator
		// provided TitleSort class
		System.out.println();
		System.out.println("Sorted books - using TitelSort class");
		System.out.println("=================================================================");
		Collections.sort(books, new TitleSort());

		for (Book nextBook : books) {
			System.out.println(nextBook);
		}

		System.out.println();
		System.out.println("Sorted books - using own ReverseTitleComparator class");
		System.out.println("=================================================================");
		Collections.sort(books, new ReverseTitleComparator());
		for (Book nextBook : books) {
			System.out.println(nextBook);
		}

		System.out.println();
		System.out.println("Sorted books - sort on id using comparator defined as anonymous inner class");
		System.out.println("=================================================================");
		Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getId() - o2.getId();
			}

		});

		for (Book nextBook : books) {
			System.out.println(nextBook);
		}

	}

}
