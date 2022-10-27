package n2excercici1;


import java.util.HashSet;
import java.util.Scanner;

public class MainRestaurant {
	static Scanner entry = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		introduirRestaurants(restaurants);
				
		

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

}
