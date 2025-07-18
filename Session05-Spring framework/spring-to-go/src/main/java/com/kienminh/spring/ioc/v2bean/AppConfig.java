package com.kienminh.spring.ioc.v2bean;

import com.kienminh.spring.ioc.v2bean.PdfGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// ko scan package để đi tìm
public class AppConfig {

    // Chủ động tạo Bean và nhờ spring để giữ giùm
    @Bean   // tên hàm lúc này ko theo chuẩn Verb + obj
            // mà khai báo như là biến
    public PdfGenerator xGen() {
        return new PdfGenerator();
        //new và trả về 1 obj như truyền thống nhưng nhờ Spring giữ giúp

    }

}

// những các để tạo obj
//1. tự khai váo biến new=> no ioc
//2. nhờ new giùm qua @ và scan, và ioc giữ giúp
//3. ta chủ động new, nhưng nhờ ICO giữ giúp
//4. nhờ new giùm qua khai báo trong file xml -> cách cũ, legacy system


