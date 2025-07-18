package com.kienminh.spring.ioc.v2bean;


// ko @ ở đây, thì phải @ ở nơi khác, để new giúp
public class PdfGenerator {
    public void generatePdf(String fileName) {
        System.out.println("v2 -> PDF"+fileName);

    }
}
