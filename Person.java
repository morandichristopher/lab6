package labproject6.persons;

public class Person {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return getClass() + "\n" + "Name: " + name;
	}
}

// Super class to everything