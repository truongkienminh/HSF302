package com.kienminh.spring.ioc.v2bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainV2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PdfGenerator gen = (PdfGenerator) context.getBean("xGen");
        gen.generatePdf("hello world");
    }
}
