package com.go2it.education.service;

import com.go2it.education.entity.Customer;

public interface ICustomerService {
    public Customer findById(int id);
    public void save(Customer customer);
    public boolean remove(int id);
    public boolean remove(Customer customer);
    public boolean updateCcNo(int id, String ccNo);
}
