package com.go2it.education.repository;

import com.go2it.education.entity.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPaymentRepository extends CrudRepository<Payment, Long> {
//    public Payment findById(int id);
//    public void save(Payment payment);
//    public boolean remove(int id);
//    public boolean remove(Payment payment);
//    public boolean update(Payment paymentToUpdate);
}
