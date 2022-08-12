package org.genspark.martintorrey;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.genspark.martintorrey")
public class MyConfig {

	@Bean
	int id() {
		return 4985883;
	}
	
	@Bean
	String name() {
		return "StudentName";
	}
	
    @Bean
    Student studentBean() {
        return new Student();
    }
    
    @Bean
    List<Phone> ph(){
		Phone phone1 = new Phone("403-400-2332");
    	Phone phone2 = new Phone("504-332-9949");
		return Arrays.asList(phone1,phone2);
    }
    
    @Bean
    Address add() {
    	return new Address();
    }
    
    @Bean
    String city() {
    	return "Rochester";
    }
    
    @Bean
    String state() {
    	return "New York";
    }
    
    @Bean
    String country() {
    	return "United States of America";
    }
    
    @Bean
    String zipcode() {
    	return "14623";
    }
}
