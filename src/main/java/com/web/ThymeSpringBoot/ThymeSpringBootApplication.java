package com.web.ThymeSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ThymeSpringBootApplication.class, args);
	}
	
	@Autowired
	private StudentRepository strepo;

	@Override
	public void run(String... args) throws Exception 
	{
		/*Student student1 = new Student();
		student1.setFirstname("Karina");
		student1.setLastname("Kumari");
		student1.setEmail("karinakum123@gmail.com");
		strepo.save(student1);
		
		Student student2 = new Student();
		student2.setFirstname("Anjali");
		student2.setLastname("Kumari");
		student2.setEmail("anjalikum7654@gmail.com");
		strepo.save(student2);
		
		Student student3 = new Student();
		student3.setFirstname("Subhaa");
		student3.setLastname("Sinha");
		student3.setEmail("subhakum187@gmail.com");
		strepo.save(student3);
		
		Student student4 = new Student();
		student4.setFirstname("Sweety");
		student4.setLastname("Sharma");
		student4.setEmail("sweetykum673@gmail.com");
		strepo.save(student4);*/
	}
	
	

}
