package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user1 = new User();
		user1.setName("Vedika");
		user1.setCity("Indore");
		user1.setStatus("Hi i am new to java");
		
			
		User user2 = new User();
		user2.setName("Uttam");
		user2.setCity("Bhopal");
		user2.setStatus("Hi i am new to java21");
		
		List<User> users = List.of(user1,user2);
		Iterable<User> result = userRepository.saveAll(users);
		result.forEach(user->{
			System.out.println("done");
		});
		
		Optional<User> optional =userRepository.findById(2);
		User user= optional.get();
		user.setName("Thomas sir");
		userRepository.save(user);
		System.out.println(user);
		
		
	}

}
