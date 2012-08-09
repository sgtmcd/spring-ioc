package jug.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunMe {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();
		ctx.scan("jug.spring");
		ctx.refresh();
		ctx1.scan("jug.spring");
		ctx1.refresh();
		MyBean b = ctx.getBean(MyBean.class);
		System.out.println(b.getAnotherBeansData());
		System.out.println(b.toString());
		System.out.println(ctx.getBean(MyBean.class).toString());
		MyBean b1 = ctx1.getBean(MyBean.class);
		System.out.println(b1.getAnotherBeansData());
		System.out.println(b1.toString());
		System.out.println(ctx1.getBean(MyBean.class).toString());
	}

}
