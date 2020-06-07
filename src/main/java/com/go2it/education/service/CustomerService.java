package com.go2it.education.service;

import com.go2it.education.entity.Customer;
import com.go2it.education.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    public Optional<Customer> findById(long i) {
        return customerRepository.findById(i);
    }

//    @Transactional
////    public void save(Customer customer){
////        customerRepository.save(customer);
////    }
////
////    @Transactional
////    public boolean remove(int id){
////        return customerRepository.remove(id);
////    }
////    @Transactional
////    public boolean remove(Customer cust){
////        return customerRepository.remove(cust);
////    }
////
////    @Override
////    @Transactional
////    public boolean updateCcNo(int id, String ccNo) {
////        Customer customerToUpdate= customerRepository.findById(id);
////
////        if (customerToUpdate != null) {
////            customerToUpdate.setCcNo(ccNo);
////            return customerRepository.update(customerToUpdate);
////        }
////        return false;
////    }
}
