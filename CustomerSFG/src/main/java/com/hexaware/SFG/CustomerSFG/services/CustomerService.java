package com.hexaware.SFG.CustomerSFG.services;

import com.hexaware.SFG.CustomerSFG.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    public CustomerDTO getByID(UUID id);
}
