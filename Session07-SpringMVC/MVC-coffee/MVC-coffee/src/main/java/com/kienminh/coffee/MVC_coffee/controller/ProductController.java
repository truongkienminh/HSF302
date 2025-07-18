package com.kienminh.coffee.MVC_coffee.controller;

import com.kienminh.coffee.MVC_coffee.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Chịu trách những url có dính đến product!!! Nó là bean @Controller

@Controller
//@RequestMapping() khi nhiều url cùng có đoạn

public class ProductController {
    // controller sau khi nhận url sẽ xử lí gì đó, và phải trả về : trang, json
    @GetMapping("/products")
    // hàm trả về trang products.html show ta toàn bộ các sản phẩm
    public String list(Model model){
//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product("123","Coffee ngon", 10_000.0));

        List<Product> productList = List.of(new Product("123","Coffee ngon", 10_000.0),
                new Product("321","Coffee ko ngon", 10_000.0));

        model.addAttribute("products",productList);
        model.addAttribute("msg","hẹ hẹ ");
        return "products"; // t thymeleaf sẽ ghép thêm .html
    }
}
