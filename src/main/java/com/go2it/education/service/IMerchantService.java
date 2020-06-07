package com.go2it.education.service;

import com.go2it.education.entity.Merchant;
import com.go2it.education.entity.dto.Result;

import java.util.List;
import java.util.Optional;

public interface IMerchantService {
    Optional<Merchant> findById(int id);

    void save(Merchant m);

    List<Result> getTotalReport();

    List<Merchant> getSortedByNeedToPay();
}
