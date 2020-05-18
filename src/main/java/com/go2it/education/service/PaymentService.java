package com.go2it.education.service;

import com.go2it.education.entity.Payment;
import com.go2it.education.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService implements IPaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment findById(int id) {
        return paymentRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    @Transactional
    public boolean remove(int id) {
        return paymentRepository.remove(id);
    }

    @Override
    @Transactional
    public boolean remove(Payment payment) {
        return paymentRepository.remove(payment);
    }
}
