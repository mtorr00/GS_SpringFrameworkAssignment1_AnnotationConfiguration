package org.genspark.martintorrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFrameworkAssignment1AnnotationConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkAssignment1AnnotationConfigurationApplication.class, args);
		

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyConfig.class);
		context.refresh();
		
		Student student1 = (Student) context.getBean(Student.class);
		
		System.out.println(student1);
		
		context.close();
	
	}

}
