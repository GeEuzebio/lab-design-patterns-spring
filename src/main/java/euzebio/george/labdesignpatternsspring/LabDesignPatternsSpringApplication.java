package euzebio.george.labdesignpatternsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LabDesignPatternsSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDesignPatternsSpringApplication.class, args);
	}

}
