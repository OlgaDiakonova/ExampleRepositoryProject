package com.go2it.education.repository;

import com.go2it.education.entity.Payment;

public interface IPaymentRepository {
    public Payment findById(int id);
    public void save(Payment payment);
    public boolean remove(int id);
    public boolean remove(Payment payment);
    public boolean update(Payment paymentToUpdate);
}
