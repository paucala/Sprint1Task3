package n2exercici2;



import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
	private String name;
	private int points;
	
	public Restaurant (String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	public int hashCode() {
		return Objects.hash(name, points);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && points == other.points;
	}
	public int compareTo(Restaurant compareRest) {
		if (this.name.equals(compareRest.getName())) {
			return compareRest.getPoints() - this.points;
		} else {
			return compareRest.getName().compareTo(this.name);
		}
	}

	
}
