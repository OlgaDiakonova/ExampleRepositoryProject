package com.go2it.education.service;

import com.go2it.education.entity.Merchant;
import com.go2it.education.entity.dto.Result;

import java.util.List;

public interface IMerchantService {
    public Merchant findById(int id);
    public List<Result> getTotalReport();
    public List<Merchant> getSortedByNeedToPay();
}
