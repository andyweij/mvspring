package demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {
    
    @Override
    protected String[] getServletMappings() {
        return new String[] {
            "/"
        };
    }

	@Override
	protected Class<?>[] getRootConfigClasses() {		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[] {
		     MVCConfig.class
		 };		
	}
}

