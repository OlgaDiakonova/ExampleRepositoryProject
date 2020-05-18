package com.go2it.education.service;

import com.go2it.education.entity.Merchant;
import com.go2it.education.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantService implements IMerchantService{
    @Autowired
    private MerchantRepository merchantRepository;
    public Merchant findById(int id) {

        return merchantRepository.findById(id);

    }
}
