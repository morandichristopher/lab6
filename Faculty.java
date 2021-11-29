package labproject6.persons;

public class Faculty extends Employee{

	private String rank;
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString() {
		return super.toString() + "\n" + "Rank: " + rank;
		
	}
}

// Sub class to Employee