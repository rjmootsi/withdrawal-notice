package com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.dao;

import com.enviro.assessment.grad001.johnmootsi.withdrawalnotice.entities.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface WithdrawalDao extends JpaRepository<Withdrawal, Long> {

    // get withdrawals by date
    @Query(value = "select w from Withdrawal as w where w.withdrawalDate=: date")
    List<Withdrawal> getWithdrawalsByDate(@Param("date") Date date);

}
