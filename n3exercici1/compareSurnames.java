package n3exercici1;

import java.util.Comparator;

public class compareSurnames implements Comparator<Person> {
	
	public int compare (Person p1, Person p2) {
		return p1.getSurnames().compareTo(p2.getSurnames());
	}

}
