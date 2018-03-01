package azure.cosmosdb.mongodb.spring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReadSecondaryCustomerRepository extends MongoRepository<Customer, String> {
	Customer findByFirstName(String firstName);

	List<Customer> findByLastName(String lastName);
}