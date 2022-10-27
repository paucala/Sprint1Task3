package n2exercici2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MainRestaurant {
	static Scanner entry = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<Restaurant> restaurantsSet = new HashSet<Restaurant>();
		introduirRestaurants(restaurantsSet);
		ArrayList<Restaurant> restaurantsArray = new ArrayList<Restaurant>(restaurantsSet);
		ordenar(restaurantsArray);
		for (Restaurant r : restaurantsArray) {
			System.out.println(r.getName());
			System.out.println(r.getPoints());
		}
		
		

	}
	public static void introduirRestaurants(HashSet<Restaurant> restaurants) {
		System.out.println("Quants restaurants vols introduir? ");
		int n = entry.nextInt();
		entry.nextLine();
		for (int i = 0; i < n; i++) {
			
			System.out.println("Nom: ");			
			String name = entry.nextLine();
			System.out.println("Punts: ");
			int points =  entry.nextInt();
			entry.nextLine();
			Restaurant restaurant = new Restaurant(name, points);
			restaurants.add(restaurant);
		}
	
		
	}
	public static void ordenar (ArrayList<Restaurant> restaurants) {
		Collections.sort(restaurants);
	}


}
