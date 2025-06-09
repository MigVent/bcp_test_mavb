package com.bcp.crud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.bcp.crud.model.Customer;
import com.bcp.crud.services.CustomerService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Obtener todos los clientes
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // Obtener un cliente por ID
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    // Crear un nuevo cliente
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Customer> createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    // Eliminar un cliente por ID
    @DeleteMapping("/{id}")
    public Mono<Void> deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }
}