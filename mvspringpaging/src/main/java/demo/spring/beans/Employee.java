package demo.spring.beans;

public class Employee {
	int employeeNumber;
	String firstName;
	String email;
	String extension;
	String jobTitle;

	public Employee() {

	}

	public Employee(int employeeNumber, String firstName, String email, String extension, String jobTitle) {
		
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.email = email;
		this.extension = extension;
		this.jobTitle = jobTitle;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", firstName=" + firstName + ", email=" + email
				+ ", extension=" + extension + ", jobTitle=" + jobTitle + "]";
	}
    
}
