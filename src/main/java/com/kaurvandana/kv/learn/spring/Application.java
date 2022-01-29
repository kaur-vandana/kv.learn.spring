package com.kaurvandana.kv.learn.spring;

import com.kaurvandana.kv.learn.spring.seva.AutowireSeva;
import com.kaurvandana.kv.learn.spring.seva.BeanSeva;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		run() method return an object of type ConfigurableApplicationContext
//		ApplicationContext : Spring IoC container is responsible for instantiating, wiring, configuring, and managing the entire life cycle of objects.
		ApplicationContext contextObject = SpringApplication.run(Application.class, args);

/*
//		with new operator an object needs is created and need to be maintained by dev
//		we don't want that, as Spring does that for us
		BeanSeva obj  = new BeanSeva();
		obj.code();
*/

//		getBean() gets the object of type BeanSeva,
//		object is created and maintained  by the Spring, for Spring to do that
//		BeanSeva class needs to be annotated by the @Component
		BeanSeva beanSevaObject = contextObject.getBean(BeanSeva.class);
		beanSevaObject.code();
		beanSevaObject.callAutowireSeva();


		AutowireSeva autowireSeva = contextObject.getBean(AutowireSeva.class);
		autowireSeva.iamAutowireSeva();
	}

}
