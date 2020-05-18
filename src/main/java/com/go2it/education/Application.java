package com.go2it.education;

import com.go2it.education.entity.Customer;
import com.go2it.education.entity.Merchant;
import com.go2it.education.service.CustomerService;
import com.go2it.education.service.ICustomerService;
import com.go2it.education.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;
import java.time.Month;

public class Application {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MerchantService merchantService = context.getBean(MerchantService.class);
        ICustomerService customerService = context.getBean(ICustomerService.class);
        Merchant m1 = merchantService.findById(1);
        System.out.println("name = " + m1.getName());

        Customer cust = customerService.findById(1);
        System.out.println(cust.toString());

        Customer customer = new Customer();
        customer.setAddress("Independence st. 25, Malaga, Spain");
        customer.setCcNo("11122233355589");
        customer.setCcType("Master Card");
        customer.seteMail("pavel@s.com");
        LocalDate dt = LocalDate.of(2019, Month.FEBRUARY, 27);
        customer.setMaturity(java.sql.Date.valueOf(dt));
        customer.setName("VPavel Po");

        customerService.save(customer);
        System.out.println("id = " + customer.getId());

//        System.out.println("The customer with id = 4 was removed successfully – " +
//                customerService.remove(4));

//        boolean result = customerService.updateCcNo(3, "555555555555");
//        System.out.println("Update finished. Result is - " + result);
//
//        Customer foundById = customerService.findById(3);
//        System.out.println(foundById);

    }
}
