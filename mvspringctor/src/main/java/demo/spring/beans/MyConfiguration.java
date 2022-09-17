package demo.spring.beans;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="demo.spring.beans")
public class MyConfiguration {
	@Bean
	public Book getService(){
		Book m=new Book(102,"C# .Net",Arrays.asList("Store1","Store2"));
		return m;
	}
}
