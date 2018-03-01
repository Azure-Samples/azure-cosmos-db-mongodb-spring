package azure.cosmosdb.mongodb.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * The basePackages needs to point to the Interfaces
 * this configuration is going to back.
 */
@Configuration
@EnableMongoRepositories(
		basePackages = "azure.cosmosdb.mongodb.spring",
		mongoTemplateRef = "readSecondaryTemplate"
		)
@Import(MongoConfiguration.class)
public class ReadSecondaryConfiguration {
	@Primary
	@Bean
	public MongoTemplate readSecondaryTemplate(
			MongoDbFactory factory) throws Exception {
		return new MongoTemplate(factory);
	}
}