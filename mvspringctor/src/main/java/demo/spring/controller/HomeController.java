package demo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.spring.beans.*;

@Controller
public class HomeController {
		
	private Book bk;	

	@Autowired
	public void setBook(Book book) {
		this.bk = book;
	}	
	
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home(Model model) {
		
		System.out.println("Autowired Book="+bk.toString());			
			
		ApplicationContext context = 
                new ClassPathXmlApplicationContext("appcontext.xml");
        Book book = (Book)context.getBean("bk1");
		   
		model.addAttribute("book", book);
		return "home";
	}
	
}

