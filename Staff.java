package labproject6.persons;

public class Staff extends Employee{

	private String title;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return super.toString() + "\n" + "Title: " + title;
		
	}
}

// Sub class to Employee
// super.toString (call in subclass to string method)