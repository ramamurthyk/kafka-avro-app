package app.kafka.schemaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableSchemaRegistryClient
public class SchemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaApplication.class, args);
	}

}
