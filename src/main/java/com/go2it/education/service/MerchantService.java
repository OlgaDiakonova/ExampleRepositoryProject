package com.go2it.education.service;

import com.go2it.education.entity.Merchant;
import com.go2it.education.entity.Payment;
import com.go2it.education.entity.dto.Result;
import com.go2it.education.repository.IMerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MerchantService implements IMerchantService{
    @Autowired
    private IMerchantRepository merchantRepository;

    @Override
    public Optional<Merchant> findById(int id) {
        return merchantRepository.findById(id);
    }

    @Transactional
    @Override
    public void save(Merchant m) {
        merchantRepository.save(m);
    }

    @Override
    public List<Result> getTotalReport() {
        return merchantRepository.getTotalReport();
    }

    @Override
    public List<Merchant> getSortedByNeedToPay() {
        return merchantRepository.findAllByOrderByNeedToSend();
    }
}
