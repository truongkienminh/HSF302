package com.kienminh.superapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratedColumn;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Student")  // nếu ko cso khai báo này thì mặc định lấy tên class thành tên table
public class Student {

    @Id
    private String id;

    @Column (name = "name", nullable = false)  //nếu ko có khai báo này thì mặc định lấy attribute làm tên cột
    @Nationalized //thiếu cái này sẽ biến thành varchar ko lưu tiếng Việt được
    private String name;

    @Column(name = "yob", nullable = false)
    private int yob;

    @Column(name = "gpa")
    private double gpa;

    //BẮT BUỘC PHẢI CÓ CONSTRUCTOR RỖNG, CONSTRUCTOR FULL THAM SỐ

}
