package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import performance.TitleSort;

public class Main {

	public static void main(String[] args) {
		Map<Book, Integer> books = new HashMap();
		books.put(new Book(1, "The Lord of the Rings", "J. R. R. Tolkien"), 7);
		books.put(new Book(2, "Le Petit Prince", "Antoine de Saint-Exupery"), 5);
		books.put(new Book(3, "Harry Potter and the Philosopher's Stone", "J. K. Rowling"), 0);
		books.put(new Book(4, "And Then There Were None", "Agatha Christie"), 12);
		books.put(new Book(5, "Dream of the Red Chamber", "Cao Xueqin"), 1);
		books.put(new Book(6, "The Hobbit", "J. R. R. Tolkien"), 1);
		books.put(new Book(7, "She: A History of Adventure", "H. Rider Haggard"), 1);
		books.put(new Book(8, "The Lion, the Witch and the Wardrobe", "C. S. Lewis"), 3);
		books.put(new Book(9, "The Da Vinci Code", "Dan Brown"), 4);
		books.put(new Book(10, "The Catcher in the Rye", "J. D. Salinger"), 111);
		books.put(new Book(11, "The Hobbit", "AB Svenska Ord"), 200);

		System.out.println();
		System.out.println("Unsorted Books, as stored in HashMap.");
		System.out.println("=========================================");

		Integer result= books.get(new Book(11, "The Hobbit", "AB Svenska Ord"));
		System.out.println("result=" + result);
	}

}
