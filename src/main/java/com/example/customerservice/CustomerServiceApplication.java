package com.example.customerservice;

import com.example.customerservice.model.Customer;
import com.example.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Random;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public CustomerServiceApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }



    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
     customerRepository.save(new Customer(new Random().nextInt(1000),"Akash","Anand","akash@email.com"));
        customerRepository.save(new Customer(new Random().nextInt(1000),"Akhil","Ahuja","akhil@email.com"));
        customerRepository.save(new Customer(new Random().nextInt(1000),"David","Joe","david@email.com"));
        customerRepository.save(new Customer(new Random().nextInt(1000),"Abhi","Gupta","abhi@email.com"));

    }
}
