package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainMonth {

	public static void main(String[] args) {
	
		ArrayList<Month> monthsArray = new ArrayList<Month>();
		Month gener = new Month("gener");
		monthsArray.add(gener);
		Month febrer = new Month("febrer");
		monthsArray.add(febrer);
		Month març = new Month("març");
		monthsArray.add(març);
		Month abril = new Month("abril");
		monthsArray.add(abril);
		Month maig = new Month("maig");
		monthsArray.add(maig);
		Month juny = new Month("juny");
		monthsArray.add(juny);
		Month juliol = new Month("juliol");
		monthsArray.add(juliol);
		Month septembre = new Month("septembre");
		monthsArray.add(septembre);
		Month octubre = new Month("octubre");
		monthsArray.add(octubre);
		Month novembre = new Month("novembre");
		monthsArray.add(novembre);
		Month desembre = new Month("desembre");
		monthsArray.add(desembre);
		Month agost = new Month("agost");
		monthsArray.add(7, agost);
		
		for (Month month : monthsArray) {
			System.out.println(month.getName());
		}
		
		System.out.println("--------------");
		
		
		HashSet<Month> monthsSet = new HashSet<Month>(monthsArray);
		monthsSet.add(desembre);
		
		//al imprimir comprobarem que només hi ha un objecte "desembre" al hashset, encara que hagi afegit 2
		Iterator<Month> it = monthsSet.iterator(); 
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}

	}

}
