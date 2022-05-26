package com.azure.cosmos.samples.mongodbspring;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

	public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
	}

	private static Logger log = LoggerFactory.getLogger(ConsoleApplication.class);
	
	@Autowired
	private ProductRepository repository;

	@Override
	public void run(String... args) {

		log.info("Delete all existing documents");
		log.info("--------------------------------");
		repository.deleteAll();
		log.info("Collection is now empty");
		log.info("--------------------------------");

		log.info("Create first document");
		log.info("--------------------------------");
		Product first = new Product(
			"gear-surf-surfboards",
			"Sunnox Surfboard",
			8,
			true
		);
		first = repository.save(first);
		log.info(first.toString());
		log.info("--------------------------------");
		
		log.info("Create second document");
		log.info("--------------------------------");
		Product second = new Product(
			"gear-surf-surfboards",
			"Noosa Surfboard",
			15,
			false
		);
		second = repository.save(second);
		log.info(second.toString());
		log.info("--------------------------------");
		
		log.info("Create second document");
		log.info("--------------------------------");
		Product third = new Product(
			"gear-surf-wetsuits",
			"Plorif Surf Wetsuit",
			2,
			false
		);
		third = repository.save(third);
		log.info(third.toString());
		log.info("--------------------------------");

		log.info("Query all documents");	
		log.info("--------------------------------");
		for (Product product : repository.findAll()) {
			log.info(product.toString());
		}
		log.info("--------------------------------");

		log.info("Query documents using a filter");	
		log.info("--------------------------------");
		for (Product product : repository.findByCategory("gear-surf-surfboards")) {
			log.info(product.toString());
		}
		log.info("--------------------------------");

		log.info("Fetch a specific document");	
		log.info("--------------------------------");
		Optional<Product> match = repository.findById(third.id);
		if (match.isPresent()) {
			log.info(match.get().toString());
		}
		log.info("--------------------------------");

	}

}