package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The BankingDetails entity represents the banking details where the withdrawal amount will be paid into.

import java.util.Objects;

public class BankingDetails {
    private Long bankingDetailsId;
    private Long branchCode;
    private String bankName;
    private String accountHolderName;
    private Long accountNumber;

//    // Relationship properties
//
//    // The withdrawal associated with these banking details.
//    private Withdrawal withdrawal; // one-to-one relationship, as each withdrawal has a single set of banking details.


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
}
