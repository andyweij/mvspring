package demo.spring.beans;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	JdbcTemplate jdbcTemplate;

	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}
	
	public int saveEmployee(Employee e){  
	    String query="insert into employees(employeeNumber,firstname,lastname,extension,email,officecode,reportsTo,jobTitle) values(%d,'%s','%s','%s','%s','%s',%d,'%s')";  
	    String sql=String.format(query, e.getEmployeeNumber(),e.getFirstName(),e.getLastName(),e.getExtension(),e.getEmail(),e.getOfficeCode(),e.getReportsTo(),e.getJobTitle());
	    return jdbcTemplate.update(sql);  
	}  
	public int updateEmployee(Employee e){  
	    String query="update employees set extension='"+e.getExtension()+"',jobTitle='"+e.getJobTitle()+"' where employeeNumber="+e.getEmployeeNumber();  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employees where employeeNumber="+e.getEmployeeNumber();  
	    return jdbcTemplate.update(query);  
	}  
}

