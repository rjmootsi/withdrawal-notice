package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The BankingDetails entity represents the banking details where the withdrawal amount will be paid into.

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "banking_details")
public class BankingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "banking_details_id", nullable = false)
    private Long bankingDetailsId;
    @Basic
    @Column(name = "branch_code", nullable = false)
    private Long branchCode;
    @Basic
    @Column(name = "bank_name", nullable = false, length = 45)
    private String bankName;
    @Basic
    @Column(name = "account_holder_name", nullable = false, length = 45)
    private String accountHolderName;
    @Basic
    @Column(name = "account_number", nullable = false)
    private Long accountNumber;

    // Relationship properties

    // one-to-one relationship, as each withdrawal has a single set of banking details.
    @OneToOne(cascade = CascadeType.REMOVE) // remove the banking details if withdrawals is removed
    @JoinColumn(name = "withdrawal_id", referencedColumnName = "withdrawal_id", nullable = false)
    private Withdrawal withdrawal; // The withdrawal associated with these banking details.


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
