package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Investor entity will represent an investor in your system.

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Investor {
    private Long investorId;
    private String investorName;
    private String investorLastname;
    private int investorAge;
    private String address;
    private String contact;

    // Relationship properties

    // A list of Product entities that the investor has invested in.
    private Set<Product> products = new HashSet<>(); // one to many as an investor can have multiple products.

    // A list of Withdrawal entities that the investor has made.
    private Set<Withdrawal> withdrawals = new HashSet<>(); // one to many as an investor can make multiple withdrawals.


    public Investor() {
    }

    public Investor(String investorName, String investorLastname, int investorAge, String address, String contact) {
        this.investorName = investorName;
        this.investorLastname = investorLastname;
        this.investorAge = investorAge;
        this.address = address;
        this.contact = contact;
    }

    public Long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(Long investorId) {
        this.investorId = investorId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getInvestorLastname() {
        return investorLastname;
    }

    public void setInvestorLastname(String investorLastname) {
        this.investorLastname = investorLastname;
    }

    public int getInvestorAge() {
        return investorAge;
    }

    public void setInvestorAge(int investorAge) {
        this.investorAge = investorAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Withdrawal> getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(Set<Withdrawal> withdrawals) {
        this.withdrawals = withdrawals;
    }

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

    @Override
    public String toString() {
        return "Investor{" +
                "investorId=" + investorId +
                ", investorName='" + investorName + '\'' +
                ", investorLastname='" + investorLastname + '\'' +
                ", investorAge=" + investorAge +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
