package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Notification entity represents a notification sent to an investor.

import java.util.Date;
import java.util.Objects;

public class WithdrawalNotification {
    private Long withdrawalNotificationId;
    private Double balanceBeforeWithdrawal;
    private Double amountWithdrawn;
    private Double closingBalance;
    private Date withdrawalDate;

    // Relationship properties

    // The investor who received the notification.
    private Investor investor; // many-to-one relationship, as multiple notifications can be associated with a single investor.


    public WithdrawalNotification() {
    }

    public WithdrawalNotification(Double balanceBeforeWithdrawal, Double amountWithdrawn, Double closingBalance, Date withdrawalDate, Investor investor) {
        this.balanceBeforeWithdrawal = balanceBeforeWithdrawal;
        this.amountWithdrawn = amountWithdrawn;
        this.closingBalance = closingBalance;
        this.withdrawalDate = withdrawalDate;
        this.investor = investor;
    }

    public Long getWithdrawalNotificationId() {
        return withdrawalNotificationId;
    }

    public void setWithdrawalNotificationId(Long withdrawalNotificationId) {
        this.withdrawalNotificationId = withdrawalNotificationId;
    }

    public Double getBalanceBeforeWithdrawal() {
        return balanceBeforeWithdrawal;
    }

    public void setBalanceBeforeWithdrawal(Double balanceBeforeWithdrawal) {
        this.balanceBeforeWithdrawal = balanceBeforeWithdrawal;
    }

    public Double getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void setAmountWithdrawn(Double amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }

    public Double getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(Double closingBalance) {
        this.closingBalance = closingBalance;
    }

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
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
        WithdrawalNotification that = (WithdrawalNotification) o;
        return Objects.equals(withdrawalNotificationId, that.withdrawalNotificationId) && Objects.equals(balanceBeforeWithdrawal, that.balanceBeforeWithdrawal) && Objects.equals(amountWithdrawn, that.amountWithdrawn) && Objects.equals(closingBalance, that.closingBalance) && Objects.equals(withdrawalDate, that.withdrawalDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withdrawalNotificationId, balanceBeforeWithdrawal, amountWithdrawn, closingBalance, withdrawalDate);
    }

    @Override
    public String toString() {
        return "WithdrawalNotification{" +
                "withdrawalNotificationId=" + withdrawalNotificationId +
                ", balanceBeforeWithdrawal=" + balanceBeforeWithdrawal +
                ", amountWithdrawn=" + amountWithdrawn +
                ", closingBalance=" + closingBalance +
                ", withdrawalDate=" + withdrawalDate +
                '}';
    }
}
