package com.go2it.education.service;

import com.go2it.education.entity.Payment;
import com.go2it.education.repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PaymentService implements IPaymentService {
    @Autowired
    private IPaymentRepository repository;

    @Override
    public Optional<Payment> findById(long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public void save(Payment p) {
        repository.save(p);
    }

//    @Override
//    @Transactional
//    public boolean remove(int id) {
//        return paymentRepository.remove(id);
//    }
//
//    @Override
//    @Transactional
//    public boolean remove(Payment payment) {
//        return paymentRepository.remove(payment);
//    }
}
