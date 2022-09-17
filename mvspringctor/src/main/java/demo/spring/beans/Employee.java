package demo.spring.beans;

public class Employee {
	int employeeNumber;
	String firstName;
	String lastName;
	String email;
	String extension;
	String jobTitle;
    int reportsTo;
    String officeCode; 
    
	public Employee() {
	}
	
	public Employee(int employeeNumber, String firstName, String lastName, String email, String extension,
			String jobTitle, int reportsTo, String officeCode) {
		
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.extension = extension;
		this.jobTitle = jobTitle;
		this.reportsTo = reportsTo;
		this.officeCode = officeCode;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getReportsTo() {
		return reportsTo;
	}


	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}


	public String getOfficeCode() {
		return officeCode;
	}


	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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
		return "Employee [employeeNumber=" + employeeNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", extension=" + extension + ", jobTitle=" + jobTitle + ", reportsTo="
				+ reportsTo + ", officeCode=" + officeCode + "]";
	}    
}


