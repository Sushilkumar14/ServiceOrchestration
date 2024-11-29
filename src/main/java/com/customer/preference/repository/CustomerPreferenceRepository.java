package com.customer.preference.repository;

import com.customer.preference.model.CustomerPreference;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerPreferenceRepository extends MongoRepository<CustomerPreference, String> {
    Optional<CustomerPreference> findByCustomerId(String customerId);
}