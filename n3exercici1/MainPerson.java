package n3exercici1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MainPerson {
	static String filePath = "dades.csv";
	static Scanner entry = new Scanner(System.in);
	
	public static void main(String[] args) {
		//he creat un hashset perque els dni son unic i no m'interesa tenir cap persona duplicada per error, 
		//després, en cada mètode, ho paso a un ArryList per poder ordenar-ho
		// Ja se que no era necesari fer el csv, però m'ha semblat una bona idea per repasar el tema de llegir archius
		HashSet<Person> personsSet = persons();
		
		int op = 0;
		do {
			System.out.println("Escull una opció:\r\n"
				+ "1.- Introduir persona ( el programa té guardades unes quantes per defecte).\r\n"
				+ "2.- Mostrar les persones ordenades per nom (A-Z).\r\n"
				+ "3.- Mostrar les persones ordenades per nom (Z-A).\r\n"
				+ "4.- Mostrar les persones ordenades per cognoms (A-Z).\r\n"
				+ "5.- Mostrar les persones ordenades per cognoms (Z-A).\r\n"
				+ "6.- Mostrar les persones ordenades per DNI (1-9).\r\n"
				+ "7.- Mostrar les persones ordenades per DNI (9-1).\r\n"
				+ "0.- Sortir.");
			op = entry.nextInt();
			entry.nextLine();
		switch(op) {
		case 1:
			insertPerson(personsSet);
			break;
		case 2:
			compareNameAscend(personsSet);
			break;
		case 3:
			compareNameDescend(personsSet);
			break;
		case 4:
			compareSurnameAscend(personsSet);
			break;
		case 5:
			compareSurnameDescend(personsSet);
			break;
		case 6:
			compareDniAscend(personsSet);
			break;
		case 7:
			compareDniDescend(personsSet);
			break;
		case 0:
			System.out.println("adeu");
			break;
		default:
			System.out.println("La opció escollida no existeix");
		}
		} while (op != 0);
		

	}
	public static HashSet<Person> persons() {
		HashSet<Person> persons = new HashSet<Person>();
		try {
			File file = new File(filePath);
			BufferedReader br = new BufferedReader (new FileReader(file));
			String line = null;
			try {
				while((line = br.readLine()) != null) {
					String[] parts = line.split(",");
					if (parts.length == 3) {
						String name = parts[0];
						String surname  = parts[1];
						String dni = parts[2];
						Person person = new Person (name, surname, dni);
						persons.add(person);
					}
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return persons;
	}
	public static void insertPerson(HashSet<Person> persons) {
		System.out.println("Nom: ");
		String name = entry.nextLine();
		System.out.println("Cognoms (separats per una barrabaixa): ");
		String surname = entry.nextLine();
		System.out.println("DNI: ");
		String dni = entry.nextLine();
		Person person = new Person (name, surname, dni);
		persons.add(person);
	}
	public static void compareNameAscend(HashSet<Person> persons) {
		ArrayList<Person> personsArray = new ArrayList<Person>(persons);
		Collections.sort(personsArray, new compareName());
		imprimir(personsArray);
	}
	public static void compareNameDescend(HashSet<Person> persons) {
		ArrayList<Person> personsArray = new ArrayList<Person>(persons);
		Collections.sort(personsArray, new compareName());
		Collections.reverse(personsArray);
		imprimir(personsArray);
	}
	public static void compareSurnameAscend(HashSet<Person> persons) {
		ArrayList<Person> personsArray = new ArrayList<Person>(persons);
		Collections.sort(personsArray, new compareSurnames());
		imprimir(personsArray);
	}
	public static void compareSurnameDescend(HashSet<Person> persons) {
		ArrayList<Person> personsArray = new ArrayList<Person>(persons);
		Collections.sort(personsArray, new compareSurnames());
		Collections.reverse(personsArray);
		imprimir(personsArray);
	}
	public static void compareDniAscend(HashSet<Person> persons) {
		ArrayList<Person> personsArray = new ArrayList<Person>(persons);
		Collections.sort(personsArray, new compareDni());
		imprimir(personsArray);
	}
	public static void compareDniDescend(HashSet<Person> persons) {
		ArrayList<Person> personsArray = new ArrayList<Person>(persons);
		Collections.sort(personsArray, new compareDni());
		Collections.reverse(personsArray);
		imprimir(personsArray);
	}
	public static void imprimir (ArrayList<Person> persons) {
		for (Person p : persons) {
			System.out.println(p.getName());
			System.out.println(p.getSurnames());
			System.out.println(p.getDni());
		}
	}

}
