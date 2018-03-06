package sortingStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		strings.add("five");
		strings.add("six");
		strings.add("seven");

		System.out.println("Unsorted strings, as stored in ArrayList.");
		for (String nextString : strings) {
			System.out.println(nextString);
		}

		System.out.println();
		System.out.println("Sorted strings, alphabetically:");
		Collections.sort(strings);

		for (String nextString : strings) {
			System.out.println(nextString);
		}

	}
}
