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

//    // Relationship properties
//
//    // The investor who received the notification.
//    private Investor investor; // many-to-one relationship, as multiple notifications can be associated with a single investor.


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
}
