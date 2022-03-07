package generics.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class SetExample_v1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// HashSet ***************************************
		System.out.println("\n*** HashSet ***************************************");
		Set<String> set = new HashSet<>();
		set.add("Table");
		set.add("TV");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}

		// TreeSet ***************************************
		System.out.println("\n*** TreeSet ***************************************");
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Table");
		treeSet.add("Tv");
		treeSet.add("Notebook");
		
		System.out.println(treeSet.contains("Notebook"));
		
		for (String p : treeSet) {
			System.out.println(p);
		}
		
		// LinkedHashSet ***************************************
		System.out.println("\n*** LinkedHashSet ***************************************");
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Table");
		linkedHashSet.add("Tv");
		linkedHashSet.add("Notebook");
		
		System.out.println(linkedHashSet.contains("Notebook"));
		
		for (String p : linkedHashSet) {
			System.out.println(p);
		}
		
		// Ohter operations...
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		System.out.println(set.contains("Notebook"));
	}
}
