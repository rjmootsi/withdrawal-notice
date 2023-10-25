package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Investment entity represents an investment made by an investor in a product.

import java.util.Objects;

public class Investment {
    private Long investmentId;
    private Double investedAmount;

//    // Relationship properties
//
//    // The investor who made the investment.
//    private Investor investor; // many-to-one relationship, as multiple investments can be associated with a single investor.
//
//    // The product in which the investment was made.
//    private Product product; // many-to-one relationship, as multiple investments can be associated with a single product.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investment that = (Investment) o;
        return Objects.equals(investmentId, that.investmentId) && Objects.equals(investedAmount, that.investedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(investmentId, investedAmount);
    }
}
