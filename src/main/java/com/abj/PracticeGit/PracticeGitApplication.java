package com.abj.PracticeGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PracticeGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeGitApplication.class, args);
		System.out.println("Application Started");
	}
	
	@GetMapping("/")
	public String test() {
		System.out.println("test controller");
		return "Application testing succsessfully";
	}

}
