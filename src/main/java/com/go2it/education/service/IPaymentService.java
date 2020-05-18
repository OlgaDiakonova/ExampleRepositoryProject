package com.go2it.education.service;

import com.go2it.education.entity.Payment;

public interface IPaymentService {
    public Payment findById(int id);
    public void save(Payment payment);
    public boolean remove(int id);
    public boolean remove(Payment payment);
}
