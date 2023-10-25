package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Product entity represents a product that an investor can invest in.

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long productId;
    @Basic
    @Column(name = "product_type", nullable = false, length = 45)
    private String productType;
    @Basic
    @Column(name = "product_name", nullable = false, length = 45)
    private String productName;
    @Basic
    @Column(name = "current_balance", nullable = false)
    private Double currentBalance;

    // Relationship properties

    // many-to-one relationship, as multiple products can be associated with a single investor.
    @ManyToOne(fetch = FetchType.LAZY) // doesn't need to view the investor when fetching a product
    @JoinColumn(name = "investor_id", referencedColumnName = "investor_id", nullable = false) // to add the foreign key
    private Investor investor; // The investor who has invested in this product.

    // one-to-many relationship, as a product can have multiple withdrawals.
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_withdrawals",
    joinColumns = {@JoinColumn(name = "product_id")},
    inverseJoinColumns = {@JoinColumn(name = "withdrawals_id")}) // adds both primary keys into the new table that manages withdrawals and products
    private Set<Withdrawal> withdrawals = new HashSet<>(); // A list of Withdrawal entities associated with this product.


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
