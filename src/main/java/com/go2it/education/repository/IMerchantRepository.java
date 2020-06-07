package com.go2it.education.repository;

import com.go2it.education.entity.Merchant;
import com.go2it.education.entity.dto.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IMerchantRepository extends JpaRepository<Merchant, Integer> {
    List<Merchant> findAllByOrderByNeedToSend();

    @Query("SELECT " +
            "new com.go2it.education.entity.dto.Result (p.merchant.name, SUM(p.chargePaid), count(p)) " +
            "FROM " +
            "Payment p " +
            "GROUP BY " +
            "p.merchant.name")
    List<Result> getTotalReport();
}