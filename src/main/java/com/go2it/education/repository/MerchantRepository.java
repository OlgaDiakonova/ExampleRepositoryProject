//package com.go2it.education.repository;
//
//import com.go2it.education.entity.Merchant;
//import com.go2it.education.entity.dto.Result;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Repository
//public class MerchantRepository implements IMerchantRepository {
//    @PersistenceContext
//    private EntityManager em;
//    public Merchant findById(int id){
//
//        Merchant m = em.find(Merchant.class, id);
//        return m;
//
//    }
//
//
//    @Override
//    public List<Result> getTotalReport() {
//        String txt = "SELECT new com.go2it.education.entity.dto.Result (p.merchant.name,SUM(p.chargePaid), count(p))";
//        txt += "FROM Payment p GROUP BY p.merchant.name";
//        TypedQuery<Result> query = em.createQuery(txt, Result.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Merchant> getSortedByNeedToPay() {
//        String txt = "SELECT m FROM Merchant m ORDER BY m.needToSend";
//        TypedQuery<Merchant> query = em.createQuery(txt, Merchant.class);
//        return query.getResultList();
//    }
//}
