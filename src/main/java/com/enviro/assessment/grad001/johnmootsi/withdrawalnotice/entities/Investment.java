package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Investment entity represents an investment made by an investor in a product.

import java.util.Objects;

public class Investment {
    private Long investmentId;
    private Double investedAmount;

    // Relationship properties

    // The investor who made the investment.
    private Investor investor; // many-to-one relationship, as multiple investments can be associated with a single investor.

    // The product in which the investment was made.
    private Product product; // many-to-one relationship, as multiple investments can be associated with a single product.


    public Investment() {
    }

    public Investment(Double investedAmount, Investor investor, Product product) {
        this.investedAmount = investedAmount;
        this.investor = investor;
        this.product = product;
    }

    public Long getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(Long investmentId) {
        this.investmentId = investmentId;
    }

    public Double getInvestedAmount() {
        return investedAmount;
    }

    public void setInvestedAmount(Double investedAmount) {
        this.investedAmount = investedAmount;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

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


    @Override
    public String toString() {
        return "Investment{" +
                "investmentId=" + investmentId +
                ", investedAmount=" + investedAmount +
                '}';
    }
}
