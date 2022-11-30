package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.entities.Address;
import guru.springframework.spring5webapp.entities.Publisher;
import guru.springframework.spring5webapp.repos.AddressRepository;
import guru.springframework.spring5webapp.repos.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final PublisherRepository publisherRepository;
    private final AddressRepository addressRepository;

    public Bootstrap(PublisherRepository publisherRepository, AddressRepository addressRepository) {
        this.publisherRepository = publisherRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("123 Main St", "Miami", "Florida", "12345");
        Publisher publisher = new Publisher("Name", address);
        addressRepository.save(address);
        publisherRepository.save(publisher);
        System.out.println("Count: " + publisherRepository.count());
        System.out.println("Publisher is in repo: " + publisherRepository.existsById(publisher.getId()));
    }
}
