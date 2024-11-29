package com.customer.preference.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "customerPreferences")
public class CustomerPreference {
    @Id
    private String customerId;
    private String preferenceId;
    private String preferenceType;
}