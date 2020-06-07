package com.go2it.education;

import com.go2it.education.entity.Customer;
import com.go2it.education.entity.Merchant;
import com.go2it.education.entity.Payment;
import com.go2it.education.entity.dto.Result;
import com.go2it.education.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Application {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IMerchantService merchantService = context.getBean(IMerchantService.class);
        merchantService.findById(1).ifPresent(System.out::println);

//        IPaymentService pmntService = context.getBean(IPaymentService.class);
//        Payment p = pmntService.findById(68);
//        System.out.println(p.toString());
//
//        IMerchantService merchantService = context.getBean(IMerchantService.class);
//        List<Result> resList = merchantService.getTotalReport();
//        for (Result r: resList) {
//
//            System.out.format("%s , %8.2f \n", r.getName(), r.getSum());
//
//        }
//
//        List<Merchant> list = merchantService.getSortedByNeedToPay();
//        for (Merchant m: list) {
//
//            System.out.println("=======================");
//            System.out.println(m.getName() + "  " + m.getNeedToSend());
//
//            System.out.println(" ");
//            List<Payment> payments = m.getPayments();
//            for (Payment pmnt : payments) {
//                System.out.println(p.toString());
//            }
//
//        }


//        ICustomerService customerService = context.getBean(ICustomerService.class);
//        Customer customer = customerService.findById(2);
//        if (customer != null){
//
//            System.out.println(customer.toString());
//            List<Merchant> merchants = customer.getMerchants();
//            for (Merchant m : merchants) {
//
//                System.out.println(m.getName());
//
//            }
//
//        }


//        Merchant m1 = merchantService.findById(1);
//        System.out.println("name = " + m1.getName());
//
//        Customer cust = customerService.findById(1);
//        System.out.println(cust.toString());
//
//        Customer customer = new Customer();
//        customer.setAddress("Independence st. 25, Malaga, Spain");
//        customer.setCcNo("11122233355589");
//        customer.setCcType("Master Card");
//        customer.seteMail("pavel@s.com");
//        LocalDate dt = LocalDate.of(2019, Month.FEBRUARY, 27);
//        customer.setMaturity(java.sql.Date.valueOf(dt));
//        customer.setName("VPavel Po");
//
//        customerService.save(customer);
//        System.out.println("id = " + customer.getId());

//        System.out.println("The customer with id = 4 was removed successfully – " +
//                customerService.remove(4));

//        boolean result = customerService.updateCcNo(3, "555555555555");
//        System.out.println("Update finished. Result is - " + result);
//
//        Customer foundById = customerService.findById(3);
//        System.out.println(foundById);

    }
}
