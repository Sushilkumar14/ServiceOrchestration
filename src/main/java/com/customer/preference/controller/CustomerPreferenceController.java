package com.customer.preference.controller;

import com.customer.preference.model.CustomerPreference;

import com.customer.preference.repository.CustomerPreferenceRepository;
import com.customer.preference.service.CustomerPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerPreferenceController {
    @Autowired
    private CustomerPreferenceService customerPreferenceService;
    @Autowired
    private CustomerPreferenceRepository customerPreferenceRepository;

    @PostMapping("/getPref")
    public CustomerPreference getPreference(@RequestBody CustomerPreference customerPreference) {
        System.out.println(customerPreference.getCustomerId()+"======++++");

       CustomerPreference preference= customerPreferenceService.getPreferencesByCustomerId(customerPreference.getCustomerId());
        System.out.println(preference+"------------------------------");
        if (preference != null) {
            return  preference;
        } else {
            return null;
        }
    }
    @PostMapping ("/save")
    public CustomerPreference apps(@RequestBody  CustomerPreference customer){
return  customerPreferenceRepository.save(customer);

    }
}