package com.go2it.education.service;

import com.go2it.education.entity.Customer;

import java.util.Optional;

public interface ICustomerService {
    Optional<Customer> findById(long i);
//    public void save(Customer customer);
//    public boolean remove(int id);
//    public boolean remove(Customer customer);
//    public boolean updateCcNo(int id, String ccNo);
}
