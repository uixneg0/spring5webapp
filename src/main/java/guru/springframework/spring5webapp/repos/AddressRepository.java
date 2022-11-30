package guru.springframework.spring5webapp.repos;

import guru.springframework.spring5webapp.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
