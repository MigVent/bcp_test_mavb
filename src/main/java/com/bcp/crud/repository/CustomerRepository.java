package com.bcp.crud.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.bcp.crud.model.Customer;

import reactor.core.publisher.Flux;

@Repository
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Long> {
    // Puedes agregar métodos personalizados si es necesario
    Flux<Customer> findByName(String name);
}