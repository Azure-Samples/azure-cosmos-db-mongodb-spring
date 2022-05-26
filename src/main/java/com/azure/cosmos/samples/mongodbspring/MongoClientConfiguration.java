package com.azure.cosmos.samples.mongodbspring;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ReadPreference;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class MongoClientConfiguration extends AbstractMongoClientConfiguration {
       
    @Value("${spring.data.mongodb.uri}")
    public String mongoUri;
    
    @Value("${spring.data.mongodb.database}")
    public String mongoDatabase;
    
    @Override
    protected String getDatabaseName() {
        return this.mongoDatabase;
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder
            .applyConnectionString(new ConnectionString(mongoUri))
            .readPreference(ReadPreference.secondary());
    }
    
}