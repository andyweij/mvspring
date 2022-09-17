package demo.spring.controller;

import java.util.List;      
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.spring.beans.*;   

@Controller    
public class EmployeeController {        
        
    @RequestMapping(value="/emp") 
    @ResponseBody
    public String employee(){    
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("appcontext.xml");  
        
        EmployeeDAO dao=(EmployeeDAO)ctx.getBean("dao");
        Employee e=new Employee();
        e.setEmployeeNumber(1900);
        e.setFirstName("Dean");
        e.setLastName("Lee");
        e.setExtension("0x1357");
        e.setEmail("dean@demo.com");
        e.setReportsTo(1056);
        e.setJobTitle("Sales");
        e.setOfficeCode("1");
        int status=dao.saveEmployee(e);  
        return ""+status;   
    }    
}   
