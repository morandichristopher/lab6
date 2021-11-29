package labproject6.persons;

public class Employee extends Person{

	private String officeNumber;
	private double salary;
	
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Office Number: " + officeNumber + "\n" + "Salary: " + salary;
		
	}
}

// extends Person
// Sub class to Person
// Super class to Faculty and Staff