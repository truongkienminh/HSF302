package com.kienminh.spring.ioc.v1scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kienminh.spring.ioc.v1scan") // vào trong package đang chỉ, quét tất cả class nào có                                                    @Service, @Repository, @Component
public class AppConfig {


}
