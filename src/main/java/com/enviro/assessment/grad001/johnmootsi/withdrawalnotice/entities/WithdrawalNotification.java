package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities;

// The Notification entity represents a notification sent to an investor.

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "withdrawal_notification")
public class WithdrawalNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "withdrawal_notification_id", nullable = false)
    private Long withdrawalNotificationId;
    @Basic
    @Column(name = "balance_before_withdrawal", nullable = false)
    private Double balanceBeforeWithdrawal;
    @Basic
    @Column(name = "amount_withdrawn", nullable = false)
    private Double amountWithdrawn;
    @Basic
    @Column(name = "closing_balance", nullable = false)
    private Double closingBalance;
    @Basic
    @Column(name = "withdrawal_date", nullable = false)
    private Date withdrawalDate;

    // Relationship properties

    // many-to-one relationship, as multiple notifications can be associated with a single investor.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "investor_id", referencedColumnName = "investor_id")
    private Investor investor; // The investor who received the notification.


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
