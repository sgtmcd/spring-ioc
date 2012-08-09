package jug.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public MyBean getMyBean(){
		return new MyBean();
	}

	@Bean
	public AnotherBean getAnotherBean() {
		return new AnotherBean(System.getProperty("foo"));
	}
}
