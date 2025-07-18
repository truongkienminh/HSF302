package com.kienminh.spring.ioc.v3di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainV3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OrderService.class);
        OrderService orderService = (OrderService) context.getBean("orderService");
        orderService.generatePdf("1451.pdf");

        // IOC new giúp pdf, new giúp service, ta chỉ việc  dùng
    }
}
