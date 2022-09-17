package demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.beans.MyAnnotatedBean;
import demo.beans.MyBean;
import demo.beans.MyConfiguration;

@Controller
@Scope("request")
public class HomeController {
		
	private MyBean myBean;
	
	private MyAnnotatedBean myAnnotatedBean;

	@Autowired
	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	@Autowired
	public void setMyAnnotatedBean(MyAnnotatedBean obj) {
		this.myAnnotatedBean = obj;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("MyBean ="+myBean.toString());
		System.out.println("MyAnnotatedBean ="+myAnnotatedBean.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyConfiguration.class);
		MyBean service = ctx.getBean(MyBean.class);
		
				
		MyBean newService = ctx.getBean(MyBean.class);
		System.out.println("service ="+service.toString());
		System.out.println("newService ="+newService.toString());
		ctx.close();
		
		return "home";
	}
	
}
