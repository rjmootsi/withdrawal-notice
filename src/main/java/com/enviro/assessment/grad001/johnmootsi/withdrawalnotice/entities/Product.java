package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Product entity represents a product that an investor can invest in.

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Product {
    private Long productId;
    private String productType;
    private String productName;
    private Double currentBalance;

    // Relationship properties

    // The investor who has invested in this product.
    private Investor investor; // many-to-one relationship, as multiple products can be associated with a single investor.

    // A list of Withdrawal entities associated with this product.
    private Set<Withdrawal> withdrawals = new HashSet<>(); // one-to-many relationship, as a product can have multiple withdrawals.


    public Product() {
    }

    public Product(String productType, String productName, Double currentBalance, Investor investor) {
        this.productType = productType;
        this.productName = productName;
        this.currentBalance = currentBalance;
        this.investor = investor;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
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
        Product product = (Product) o;
        return Objects.equals(productId, product.productId) && Objects.equals(productType, product.productType) && Objects.equals(productName, product.productName) && Objects.equals(currentBalance, product.currentBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productType, productName, currentBalance);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productType='" + productType + '\'' +
                ", productName='" + productName + '\'' +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
