package com.go2it.education.repository;

import com.go2it.education.entity.Merchant;
import com.go2it.education.entity.dto.Result;

import java.util.List;

public interface IMerchantRepository {
    public Merchant findById(int id);
    public List<Result> getTotalReport();
    public List<Merchant> getSortedByNeedToPay();
}
