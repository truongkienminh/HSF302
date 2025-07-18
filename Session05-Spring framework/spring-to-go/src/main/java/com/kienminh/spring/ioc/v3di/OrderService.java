package com.kienminh.spring.ioc.v3di;


public class OrderService {
    // xài dependency và chích vào qua Constructor
    private PdfGenerator pdfGenerator; // ko new, chờ tiêm vào

    public OrderService(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }

    //xài dependency c new và đưa vào từ ngoài
    public void generatePdf(String fileName) {
        pdfGenerator.generatePdf("1234.pdf");
    }
}
