package azure.cosmosdb.for.mongodb.api.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ReadPreference;

@Configuration
public class MongoConfiguration {
	@Value("${spring.data.mongodb.uri:mongodb://localhost:27017}")
	private String mongoUri;

	/**
	 * Creates a base instance that can be configured for each
	 * implementation.
	 *
	 * @return A generic instance pointed at the hosts.
	 * @throws Exception
	 */
	private Mongo createMongo() throws Exception {
		return new MongoClient(new MongoClientURI(mongoUri));
	}

	@Primary
	@Bean
	public Mongo readFromSecondaryMongo() throws Exception {
		final Mongo mongo = createMongo();
		// Do custom global configuration
		mongo.setReadPreference(ReadPreference.secondary());
		return mongo;
	}

	@Bean
	public Mongo readFromPrimaryMongo() throws Exception {
		final Mongo mongo = createMongo();
		mongo.setReadPreference(ReadPreference.primaryPreferred());
		return mongo;
	}

	@Bean
	public MongoDbFactory mongoDbFactory(Mongo mongo) {
		return new SimpleMongoDbFactory(mongo, "springgeo");
	}
}