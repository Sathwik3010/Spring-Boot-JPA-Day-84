package com.codegnan;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codegnan.model.User;
import com.codegnan.service.UserService;

@SpringBootApplication
public class SpringbootDataJpaApplication implements CommandLineRunner{

	private UserService userService;
	
	public SpringbootDataJpaApplication(UserService userService) {
		super();
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User("Dev Sathwik", "Potti", "dev@gmail.com", "9493847077");
//		User user2 = new User("Mahesh ", "Babu", "mahesh@gmail.com", "9493897077"); 
//		User user3 = new User("Sudheer", "Kumar", "kumar@gmail.com", "9563847072"); 
//		userService.addUser(user1);
//		userService.addUser(user2);
//		userService.addUser(user3);
//		
//		System.out.println("User Objects are saved Successfully");

		
//		List<User> users= userService.findAllUser();
//		users.forEach(System.out::println);
		
//		User fetchUser = userService.findByUserId(2);
//		System.out.println(fetchUser);
		
//		User updateUser = new User();
//		updateUser.setFirstName("mani");
//		updateUser.setLastName("sharma");
//		updateUser.setEmail("mani@gmail.com");
//		updateUser.setPhone("7586421953");
//		userService.updateUser(3, updateUser);		
//		System.out.println("User Updated Succesfully");
//		
		System.out.println("Delete the record ID 3");
		userService.deleteUser(3);
	}

}
