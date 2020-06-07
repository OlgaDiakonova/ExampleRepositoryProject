//package com.go2it.education.repository;
//
//import com.go2it.education.entity.Payment;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//@Repository
//public class PaymentRepository implements IPaymentRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    @Override
//    public Payment findById(int id) {
//        Payment pmnt = null;
//        pmnt = em.find(Payment.class, id);
//        return pmnt;
//    }
//
//    @Override
//    public void save(Payment payment) {
//        if (payment.getId() == 0) {
//            em.persist(payment);
//        } else {
//            em.merge(payment);
//        }
//    }
//
//    @Override
//    public boolean remove(int id) {
//        Payment payment = findById(id);
//        if (payment != null){
//            em.remove(payment);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean remove(Payment pmnt) {
//        if (pmnt != null) {
//            em.remove(pmnt);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean update(Payment paymentToUpdate) {
//        if(paymentToUpdate != null){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//}
