package com.customer.preference.service;

import com.customer.preference.model.CustomerPreference;
import com.customer.preference.repository.CustomerPreferenceRepository;
import com.mongodb.client.MongoClients;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerPreferenceService {
    @Autowired
    private CustomerPreferenceRepository customerPreferenceRepository;

    public CustomerPreference getPreferencesByCustomerId(String customerId) {
        Optional<CustomerPreference> byCustomerId = customerPreferenceRepository.findByCustomerId(customerId);
        return byCustomerId.get();
    }
}