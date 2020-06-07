package com.go2it.education.service;

import com.go2it.education.entity.Payment;

import java.util.Optional;

public interface IPaymentService {
    Optional<Payment> findById(long id);

    void save(Payment p);
//    public boolean remove(int id);
//    public boolean remove(Payment payment);
}
