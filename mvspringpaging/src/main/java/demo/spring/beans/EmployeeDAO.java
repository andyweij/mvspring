package demo.spring.beans;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;       
    
public class EmployeeDAO {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
    
public List<Employee> getEmployeesByPage(int pageid,int total){    
    String sql="select * from classicmodels.employees limit "+(pageid-1)+","+total;    
    return template.query(sql,new RowMapper<Employee>(){    
        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
            Employee e=new Employee();    
            e.setEmployeeNumber(rs.getInt("employeenumber"));    
            e.setFirstName(rs.getString("firstname"));    
            e.setEmail(rs.getString("email"));
            e.setJobTitle(rs.getString("jobtitle"));
            e.setExtension(rs.getString("extension"));
            return e;    
        }    
    });    
}    
}    

