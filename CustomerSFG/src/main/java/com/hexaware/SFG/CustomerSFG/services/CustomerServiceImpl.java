package com.hexaware.SFG.CustomerSFG.services;

import com.hexaware.SFG.CustomerSFG.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDTO getByID(UUID id) {
        return CustomerDTO.builder().id(id)
                .name("JOHN")
                .build();
    }
}

