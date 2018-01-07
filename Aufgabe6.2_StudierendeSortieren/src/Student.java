

public class Student {
	private int matriculationNumber;
	private String firstname;
	private String lastname;
	
	public Student(int matriculationNumber,String firstname, String lastname){
		
		this.matriculationNumber = matriculationNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		
	}
	public int getMatriculationNumber() {
		return matriculationNumber;
	}
	public void setMatriculationNumber(int matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
}
