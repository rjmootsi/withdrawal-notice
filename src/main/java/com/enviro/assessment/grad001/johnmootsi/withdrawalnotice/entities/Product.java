package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Product entity represents a product that an investor can invest in.

import java.util.List;
import java.util.Objects;

public class Product {
    private Long productId;
    private String productType;
    private String productName;
    private Double currentBalance;

//    // Relationship properties
//
//    // The investor who has invested in this product.
//    private Investor investor; // many-to-one relationship, as multiple products can be associated with a single investor.
//
//    // A list of Withdrawal entities associated with this product.
//    private List<Withdrawal> withdrawals; // one-to-many relationship, as a product can have multiple withdrawals.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) && Objects.equals(productType, product.productType) && Objects.equals(productName, product.productName) && Objects.equals(currentBalance, product.currentBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productType, productName, currentBalance);
    }
}
