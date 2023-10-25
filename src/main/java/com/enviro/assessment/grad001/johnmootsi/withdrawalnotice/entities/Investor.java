package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Investor entity will represent an investor in your system.

import java.util.List;
import java.util.Objects;

public class Investor {
    private Long investorId;
    private String investorName;
    private String investorLastname;
    private int investorAge;
    private String address;
    private String contact;

//    // Relationship properties
//
//    // A list of Product entities that the investor has invested in.
//    private List<Product> products; // one to many as an investor can have multiple products.
//
//    // A list of Withdrawal entities that the investor has made.
//    private List<Withdrawal> withdrawals; // one to many as an investor can make multiple withdrawals.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investor investor = (Investor) o;
        return investorAge == investor.investorAge && Objects.equals(investorId, investor.investorId) && Objects.equals(investorName, investor.investorName) && Objects.equals(investorLastname, investor.investorLastname) && Objects.equals(address, investor.address) && Objects.equals(contact, investor.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(investorId, investorName, investorLastname, investorAge, address, contact);
    }
}
