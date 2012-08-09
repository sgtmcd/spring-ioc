package jug.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBean {
	@Autowired
	private AnotherBean anotherBean;
	
	public String getAnotherBeansData(){
		return anotherBean.getDataConfig();
	}
	
}
