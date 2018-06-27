package jccm.PEPSOL;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class PepsolApplication {

	public static void main(String[] args) {
		SpringApplication.run(PepsolApplication.class, args);
	}
}
