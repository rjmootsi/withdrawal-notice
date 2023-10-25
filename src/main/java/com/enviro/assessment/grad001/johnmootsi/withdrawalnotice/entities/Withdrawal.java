package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Withdrawal entity represents a withdrawal made by an investor.

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "withdrawals")
public class Withdrawal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "withdrawal_id", nullable = false)
    private Long withdrawalId;
    @Basic
    @Column(name = "withdrawal_amount", nullable = false)
    private Double withdrawalAmount;
    @Basic
    @Column(name = "withdrawal_date", nullable = false)
    private Date withdrawalDate;

    // Relationship properties


    // One-to-One relationship with Withdrawal: Each set of banking details is associated with a single withdrawal.
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banking_details_id", referencedColumnName = "banking_details_id", nullable = false)
    private BankingDetails bankingDetails; // The banking details where the withdrawal amount will be paid into.

    // many-to-one relationship, as multiple withdrawals can be associated with a single product.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", nullable = false)
    private Product product; // The product from which the withdrawal is being made.

    // many-to-one relationship, as multiple withdrawals can be associated with a single investor.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "investor_id", referencedColumnName = "investor_id", nullable = false)
    private Investor investor; // The investor who is making the withdrawal.


    public Withdrawal() {
    }

    public Withdrawal(Double withdrawalAmount, Date withdrawalDate, BankingDetails bankingDetails, Product product, Investor investor) {
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
        this.bankingDetails = bankingDetails;
        this.product = product;
        this.investor = investor;
    }

    public Long getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(Long withdrawalId) {
        this.withdrawalId = withdrawalId;
    }

    public Double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(Double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }

    public BankingDetails getBankingDetails() {
        return bankingDetails;
    }

    public void setBankingDetails(BankingDetails bankingDetails) {
        this.bankingDetails = bankingDetails;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

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


    @Override
    public String toString() {
        return "Withdrawal{" +
                "withdrawalId=" + withdrawalId +
                ", withdrawalAmount=" + withdrawalAmount +
                ", withdrawalDate=" + withdrawalDate +
                ", bankingDetails=" + bankingDetails +
                '}';
    }
}
