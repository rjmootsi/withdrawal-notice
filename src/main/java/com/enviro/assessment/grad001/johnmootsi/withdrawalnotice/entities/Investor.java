package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Investor entity will represent an investor in your system.

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "investors")
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "investor_id", nullable = false)
    private Long investorId;
    @Basic
    @Column(name = "investor_name", nullable = false, length = 45)
    private String investorName;
    @Basic
    @Column(name = "investor_lastname", nullable = false, length = 45)
    private String investorLastname;
    @Basic
    @Column(name = "investor_age", nullable = false)
    private int investorAge;
    @Basic
    @Column(name = "investor_address", nullable = false)
    private String address;
    @Basic
    @Column(name = "investor_contact", nullable = false, length = 45)
    private String contact;

    // Relationship properties

    // one to many as an investor can have multiple products.
    @OneToMany(mappedBy = "investor", fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>(); // A list of Product entities that the investor has invested in.

    // one to many as an investor can make multiple withdrawals.
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "investor_withdrawals",
            joinColumns = {@JoinColumn(name = "investor_id")},
            inverseJoinColumns = {@JoinColumn(name = "withdrawals_id")}) // adds both primary keys into the new table that manages withdrawals and investors
    private Set<Withdrawal> withdrawals = new HashSet<>(); // A list of Withdrawal entities that the investor has made.


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
