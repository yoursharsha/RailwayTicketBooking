package org.railway.ticketbooking.Implementation;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//import com.railway.ticketbooking.App;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.railway.ticketbooking")
// @ComponentScan(basePackages = {"org.railway.ticketbooking.Implementation"})
// @ComponentScan(basePackages = {"org.railway.ticketbooking.Implementation"})
@ComponentScan({"org.railway.ticketbooking.Implementation,org.railway.ticketbooking.Schemas,org.railway.ticketbooking.Data,org.railway.ticketbooking.DAO"})

public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}
