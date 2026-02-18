package in.n4smh.microservices.person.shared;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "in.n4smh.microservices.person")
public class PersonSharedApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersonSharedApplication.class, args);
	}
}
