package com.kienminh.fap.entity;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
    private int yob;
    private double salary;


    // đoạn code boilder-plate :

    // có cách khoong cần viết đoạn code này mà vẫn có thể dùng
    // c# gọi là kĩ thuật PROPERTY chính hãng
    //java : ko có kĩ thuật này chính hãng, mà là bên thứ 3 hỗ trợ
    // có bộ thư viện giúp GENERATe đoạn code BOILDER-PLATE
}
