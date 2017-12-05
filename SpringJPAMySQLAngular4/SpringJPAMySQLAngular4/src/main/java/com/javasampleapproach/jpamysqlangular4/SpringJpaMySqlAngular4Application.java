package com.javasampleapproach.jpamysqlangular4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.jpamysqlangular4.model.Customer;
import com.javasampleapproach.jpamysqlangular4.repo.CustomerRepository;

@SpringBootApplication
public class SpringJpaMySqlAngular4Application implements CommandLineRunner {
	@Autowired
	public CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMySqlAngular4Application.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		if(customerRepository.findAll()==null){
		customerRepository.save(new Customer("xx","yy"));
		customerRepository.save(new Customer("xx1","yy"));
		customerRepository.save(new Customer("xx2","yy"));
		customerRepository.save(new Customer("xx3","yy"));
		}
		
	}

}
