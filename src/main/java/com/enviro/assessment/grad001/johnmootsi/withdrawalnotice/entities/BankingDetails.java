package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The BankingDetails entity represents the banking details where the withdrawal amount will be paid into.

import java.util.Objects;

public class BankingDetails {
    private Long bankingDetailsId;
    private Long branchCode;
    private String bankName;
    private String accountHolderName;
    private Long accountNumber;

    // Relationship properties

    // The withdrawal associated with these banking details.
    private Withdrawal withdrawal; // one-to-one relationship, as each withdrawal has a single set of banking details.


    public BankingDetails() {
    }

    public BankingDetails(Long branchCode, String bankName, String accountHolderName, Long accountNumber, Withdrawal withdrawal) {
        this.branchCode = branchCode;
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.withdrawal = withdrawal;
    }

    public Long getBankingDetailsId() {
        return bankingDetailsId;
    }

    public void setBankingDetailsId(Long bankingDetailsId) {
        this.bankingDetailsId = bankingDetailsId;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Withdrawal getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(Withdrawal withdrawal) {
        this.withdrawal = withdrawal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankingDetails that = (BankingDetails) o;
        return Objects.equals(bankingDetailsId, that.bankingDetailsId) && Objects.equals(branchCode, that.branchCode) && Objects.equals(bankName, that.bankName) && Objects.equals(accountHolderName, that.accountHolderName) && Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankingDetailsId, branchCode, bankName, accountHolderName, accountNumber);
    }

    @Override
    public String toString() {
        return "BankingDetails{" +
                "bankingDetailsId=" + bankingDetailsId +
                ", branchCode=" + branchCode +
                ", bankName='" + bankName + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
