package com.kienminh.spring.noioc;

public class MainNoIoC {
    public static void main(String[] args) {
        // active new dependency, manage itself
        PdfGenerator pdfGenerator = new PdfGenerator();
        pdfGenerator.generateFile("2025061200000001.pdf");

        // main is the place contains OBJ dependency, it's also called "CONTRAINER"

    }
}
