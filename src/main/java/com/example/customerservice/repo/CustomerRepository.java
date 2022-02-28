package com.example.customerservice.repo;

import com.example.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}