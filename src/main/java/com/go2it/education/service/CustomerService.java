package com.go2it.education.service;

import com.go2it.education.entity.Customer;
import com.go2it.education.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Transactional
    public void save(Customer customer){
        customerRepository.save(customer);
    }

    @Transactional
    public boolean remove(int id){
        return customerRepository.remove(id);
    }
    @Transactional
    public boolean remove(Customer cust){
        return customerRepository.remove(cust);
    }

    @Override
    @Transactional
    public boolean updateCcNo(int id, String ccNo) {
        Customer customerToUpdate= customerRepository.findById(id);

        if (customerToUpdate != null) {
            customerToUpdate.setCcNo(ccNo);
            return customerRepository.update(customerToUpdate);
        }
        return false;
    }
}