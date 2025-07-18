package com.kienminh.spring.ioc.v1scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV1 {
    public static void main(String[] args) {
        // Tạo ra trùm cuối quản lí các obj trong RAM - lúc này obj sẽ gọi là bean
        // gọi là ApplicationContext - IoC container
        // Trùm cuối sẽ scan các package có @, new nó cho ta dùng
        //  Giông như khi chơi với TABLE, có trùm cuối là EntityManagerFactory

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // Nhờ trùm cuối quản lí các obj đã new, lấy giúp obj pdfGenerator ra dùng, qua hàm getBean() obj lúc này đưuọc gọi là bean
        PdfGenerator pdfGenerator = applicationContext.getBean(PdfGenerator.class);
        pdfGenerator.generatePdf("1424.pdf");
    }
}

// ko chủ động new 1 dependency thì phải chỉ cho spring biết new ở đâu,
// 1. new class nào, và
// 2. chính vào class nào
