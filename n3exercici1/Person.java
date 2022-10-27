package n3exercici1;

import java.util.Objects;

public class Person {
	private String name;
	private String surnames;
	private String dni;
	
	public Person (String name, String surnames, String dni) {
		this.name = name;
		this.surnames = surnames;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public String getSurnames() {
		return surnames;
	}

	public String getDni() {
		return dni;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	public int hashCode() {
		return Objects.hash(dni, name, surnames);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(name, other.name)
				&& Objects.equals(surnames, other.surnames);
	}
	
	

}
