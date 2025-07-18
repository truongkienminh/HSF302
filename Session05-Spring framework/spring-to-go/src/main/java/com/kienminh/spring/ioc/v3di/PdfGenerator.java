package com.kienminh.spring.ioc.v3di;

import org.springframework.stereotype.Component;

@Component
public class PdfGenerator {

    public void generatePdf(String path) {
        System.out.println("V3 DI");
    }
}
