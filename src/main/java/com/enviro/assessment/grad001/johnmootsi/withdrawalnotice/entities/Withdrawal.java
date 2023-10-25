package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Withdrawal entity represents a withdrawal made by an investor.

import java.util.Date;
import java.util.Objects;

public class Withdrawal {
    private Long withdrawalId;
    private Double withdrawalAmount;
    private Date withdrawalDate;

//    // Relationship properties
//
//    // The banking details where the withdrawal amount will be paid into.
//    private BankingDetails bankingDetails; // Each withdrawal has a set of banking details.
//
//    // The product from which the withdrawal is being made.
//    private Product product; // many-to-one relationship, as multiple withdrawals can be associated with a single product.
//
//    // The investor who is making the withdrawal.
//    private Investor investor; // many-to-one relationship, as multiple withdrawals can be associated with a single investor.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Withdrawal that = (Withdrawal) o;
        return Objects.equals(withdrawalId, that.withdrawalId) && Objects.equals(withdrawalAmount, that.withdrawalAmount) && Objects.equals(withdrawalDate, that.withdrawalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withdrawalId, withdrawalAmount, withdrawalDate);
    }
}
