package com.SpringPart1.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SpringPart1Application.class)
public class SpringPart1ApplicationTests {
	UserServiceImpl userServiceIml=new UserServiceImpl();

	@Test
	void addUser(){
		userServiceIml.addUser(1,"Neil","Armstrong");
		assertEquals("Neil Armstrong Was Successfully Entered",userServiceIml.addUser(1,"Neil","Armstrong"));
	}

	@Test
	void removeUser(){
		userServiceIml.addUser(1,"Neil","Armstrong");
		assertEquals("Neil Armstrong Was Successfully Removed",userServiceIml.removeUser (1));
	}

	@Test
	void getUser(){
		userServiceIml.addUser(1,"Neil","Armstrong");
		assertEquals("Hello Neil",userServiceIml.getUser(1));
	}
}