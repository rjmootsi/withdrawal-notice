package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Withdrawal entity represents a withdrawal made by an investor.

import java.util.Date;
import java.util.Objects;

public class Withdrawal {
    private Long withdrawalId;
    private Double withdrawalAmount;
    private Date withdrawalDate;

    // Relationship properties

    // The banking details where the withdrawal amount will be paid into.
    private BankingDetails bankingDetails; // Each withdrawal has a set of banking details.

    // The product from which the withdrawal is being made.
    private Product product; // many-to-one relationship, as multiple withdrawals can be associated with a single product.

    // The investor who is making the withdrawal.
    private Investor investor; // many-to-one relationship, as multiple withdrawals can be associated with a single investor.


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
