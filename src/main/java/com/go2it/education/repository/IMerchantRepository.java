package com.go2it.education.repository;

import com.go2it.education.entity.Merchant;

public interface IMerchantRepository {
    public Merchant findById(int id);
}
