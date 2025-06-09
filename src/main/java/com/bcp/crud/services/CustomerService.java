package com.bcp.crud.services;

import org.springframework.stereotype.Service;

import com.bcp.crud.model.Customer;
import com.bcp.crud.repository.CustomerRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Obtener todos los clientes
    public Flux<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Obtener un cliente por ID
    public Mono<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Crear un nuevo cliente
    public Mono<Customer> createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Eliminar un cliente por ID
    public Mono<Void> deleteCustomer(Long id) {
        return customerRepository.deleteById(id);
    }
}