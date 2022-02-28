package com.example.orderservice;

import com.example.orderservice.model.Order;
import com.example.orderservice.repo.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Random;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication implements CommandLineRunner {
    private final OrderRepository orderRepository;

    public OrderServiceApplication(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        orderRepository.save(new Order(new Random().nextInt(1000),"Toy",10.0));
        orderRepository.save(new Order(new Random().nextInt(1000),"Laptop",599.0));
        orderRepository.save(new Order(new Random().nextInt(1000),"Ipad",399.0));
        orderRepository.save(new Order(new Random().nextInt(1000),"Desktop",399.0));

    }
}
