package demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.beans")
public class MyConfiguration {

	@Bean
	public MyBean getService(){
		MyBean m=new MyBean();
		m.setName("Just Test");
		return m;
	}
}

