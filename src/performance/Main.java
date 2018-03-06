package performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Vector;

import sortingObjects.Book;

public class Main {

	public static void main(String[] args) {
		Random randomGenerator = new Random();
		int loop = 5;
		double[] arrayTime = new double[loop];
		double[] linkedTime = new double[loop];
		double[] vectorTime = new double[loop];

		System.out.println("Measure sort time depending on type of List");
		System.out.println();
		System.out.println("number of iterations: " + loop);

		System.out.println("Measured list types: Arraylist, LinkedList, Vecor");

		for (int c = 0; c < loop; c++) {
			System.out.println("Loop count: " + (c+1));
			// ArrayList
			List<Book> list = new ArrayList<Book>();
			for (int i = 0; i < 1000000; i++) {
				list.add(new Book(i, "test" + randomGenerator.nextInt(2000000), "test" + i));
			}

			Long start = System.nanoTime();
			Collections.sort(list, new TitleSort());
			Long end = System.nanoTime();
			arrayTime[c] = (end - start) / 1e6; // milliseconds

			// LinkedList
			List<Book> llist = new LinkedList<Book>();
			for (int i = 0; i < 1000000; i++) {
				llist.add(new Book(i, "test" + randomGenerator.nextInt(2000000), "test" + i));
			}

			start = System.nanoTime();
			Collections.sort(llist, new TitleSort());
			end = System.nanoTime();
			linkedTime[c] = (end - start) / 1e6; // milliseconds

			// VectorList
			List<Book> vlist = new Vector<Book>();
			for (int i = 0; i < 1000000; i++) {
				vlist.add(new Book(i, "test" + randomGenerator.nextInt(2000000), "test" + i));
			}

			start = System.nanoTime();
			Collections.sort(vlist, new TitleSort());
			end = System.nanoTime();
			vectorTime[c] = (end - start) / 1e6; // milliseconds

		} // end loop

		OptionalDouble average;
		System.out.println("Mean values per list types.");
		average = Arrays.stream(arrayTime).average();
		System.out.println("ArrayList: " + average.getAsDouble());
		average = Arrays.stream(linkedTime).average();
		System.out.println("LinkedList: " + average.getAsDouble());
		average = Arrays.stream(vectorTime).average();
		System.out.println("Vector: " + average.getAsDouble());

	}
}
