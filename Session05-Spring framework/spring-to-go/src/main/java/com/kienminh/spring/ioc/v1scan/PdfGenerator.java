package com.kienminh.spring.ioc.v1scan;

import org.springframework.stereotype.Component;

@Component // có chữ này là Spring sẽ new giúp
// @Service, @Repository cũng được nhưng @Component bao 2 thằng này
public class PdfGenerator {
    public void generatePdf(String fileName) {
        System.out.println("pdf: " + fileName);
    }
}
