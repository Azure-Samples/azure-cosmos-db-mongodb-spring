package com.azure.cosmos.samples.mongodbspring;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

@Document(collection = "products")
public interface ProductRepository extends MongoRepository<Product, String> {

    public Optional<Product> findById(String id);

    public List<Product> findByCategory(String category);
    
}