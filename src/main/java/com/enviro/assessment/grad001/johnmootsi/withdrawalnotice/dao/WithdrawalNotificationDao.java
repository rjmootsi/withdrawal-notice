package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.dao;

import com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities.WithdrawalNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WithdrawalNotificationDao extends JpaRepository<WithdrawalNotification, Long> {
}
