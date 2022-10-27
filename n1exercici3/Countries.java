package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Countries {
	final static String filepath = "countries.txt";
	static Scanner entry = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		HashMap<String, String> countries = newmap();		
		contest(countries);		
		
	}
	public static HashMap<String, String> newmap() {
		HashMap<String, String> newmap = new HashMap<String, String>();
		File file = new File(filepath);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String data = null;
			  try {
				while ((data = br.readLine()) != null) {					
					String[] parts = data.split(" ");
					if (parts.length == 2) {
					String part1 = parts[0];
					String part2 = parts[1];
					if(!part1.equals("") && !part2.equals("")) {
					newmap.put(part1, part2);
					}
					}
				  }			
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
	            try {
	                br.close();
	            }
	            catch (Exception e) {
	            }
		}
		}
		return newmap; 
	}
	public static void contest (HashMap<String, String> map) {
		try {
			FileWriter file = new FileWriter("Full del concursant.txt", true);
			BufferedWriter output = new BufferedWriter(file);
			
			int points = 0;
			
			System.out.println("Digues el teu nom: ");
			String nom = entry.nextLine();
			
			for (int i = 0; i < 10; i++) {
				Object[] random = map.keySet().toArray();
				Object key = random[new Random().nextInt(random.length)];
				System.out.println("Digues la capital de " + key + ":");
				String resposta = entry.nextLine();
				String correcte = (String)map.get(key);
				if (resposta.equalsIgnoreCase(correcte)) {
					points++;
					System.out.println("Resposta correcta, portes " + points + " punts");
				} else {
					System.out.println("Resposta incorrecta");
				}
			}
			output.write("El concursant " + nom + " ha fet " + points + " punts.\n");
			output.close();
		
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("programa tancat");
		}
		
	} 

}
