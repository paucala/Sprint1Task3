package n1exercici2;

import java.util.*;

public class Llistes {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(42);
		mylist.add(2);
		mylist.add(30);
		mylist.add(14);
		
		Collections.sort(mylist);
		ListIterator<Integer> it = mylist.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		List<Integer> mylistreverse = new ArrayList<Integer>();
		while (it.hasPrevious()) {
			mylistreverse.add(it.previous());
		}
		ListIterator<Integer> it2 = mylistreverse.listIterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
