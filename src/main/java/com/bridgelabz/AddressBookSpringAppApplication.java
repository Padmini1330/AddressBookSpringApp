package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookSpringAppApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(AddressBookSpringAppApplication.class, args);
		log.info("AddressBook App started in {} Environment", context.getEnvironment().getProperty("environment"));
	}

}