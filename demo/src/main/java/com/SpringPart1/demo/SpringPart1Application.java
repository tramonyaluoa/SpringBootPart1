package com.SpringPart1.demo;
import com.SpringPart1.demo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringPart1Application {

	public static void main(String[] args) {
		SpringApplication.run (SpringPart1Application.class, args);
		UserServiceImpl user = new UserServiceImpl ( );

		System.out.println (user.addUser (1, "Neil", "Armstrong"));
		System.out.println (user.getUser (1));
		System.out.println (user.removeUser (1));
System.out.println ( "" );
		System.out.println (user.addUser (2, "Teboho", "Ramonyaluoa"));
		System.out.println (user.getUser (2));
		System.out.println (user.removeUser (2));
	}}