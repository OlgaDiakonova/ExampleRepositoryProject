package com.go2it.education.repository;

import com.go2it.education.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerRepository implements ICustomerRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Customer findById(int id){
        Customer customer = null;
        customer = em.find(Customer.class, id);
        return customer;
    }
    @Override
    public void save(Customer customer){
        if (customer.getId() == 0) {
            em.persist(customer);
        } else {
            em.merge(customer);
        }
    }

    @Override
    public boolean remove(int id){
        Customer customer = findById(id);
        if (customer != null){
            em.remove(customer);
            return true;
        }
        return false;
    }
    @Override
    public boolean remove(Customer cust) {
        if (cust != null) {
            em.remove(cust);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(Customer customerToUpdate) {
        if(customerToUpdate != null){
            return true;
        }else {
            return false;
        }
    }
}
