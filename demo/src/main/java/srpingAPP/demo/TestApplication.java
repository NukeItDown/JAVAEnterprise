package srpingAPP.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import srpingAPP.demo.schemes.StudentRepository;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@Override
	public void run(String... args)  {
		System.out.println("App started...");
	}
}
