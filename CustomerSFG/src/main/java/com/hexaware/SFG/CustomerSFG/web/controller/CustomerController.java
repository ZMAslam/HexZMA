package com.hexaware.SFG.CustomerSFG.web.controller;

import com.hexaware.SFG.CustomerSFG.services.CustomerService;
import com.hexaware.SFG.CustomerSFG.web.model.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {this.customerService = customerService;};

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("id") UUID uuid) {
        return new ResponseEntity<>(customerService.getByID(uuid), HttpStatus.OK);
    }

}
