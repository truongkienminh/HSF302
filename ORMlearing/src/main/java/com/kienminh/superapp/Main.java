package com.kienminh.superapp;

import com.kienminh.superapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        insertStudent();
        getAllStudents();
    }

    public static void insertStudent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.kienminh.superapp-PU"); //gửi thông báo cấu hình server nhà thầu JPA: hibernate,nhà thầu JDBC cho JPA lo để tạo kết nối tới CSDL cụ thể MySQL
        EntityManager em = emf.createEntityManager();
        //tạo ra 1 obj dùng để quản lí các entity class - map ngang sang table
        // class Student chịu sự quản lí của em/EntityManager
        // em/EntityManager sẽ lo CRUD của 1 table nào đó
        //Chuẩn bị data student
        Student student1 = new Student("SE01","An",2004,8.5);
        Student student2 = new Student("SE02","Binh",2004,8.5);
        Student student3 = new Student("SE03","Cuong",2004,8.5);

        // gọi EntityManage giúp CRUD
        em.getTransaction().begin(); // bắt buộc phải có thay đổi khi có sự thay đổi db
        em.persist(student1);
        em.persist(student2);
        em.persist(student3);
        em.getTransaction().commit(); //hoặc cả 3 insert thành công hoặc ko có ai đưuọc insert vào table
        em.close(); // đã xong công việc của em
        emf.close();// ngắt kết nối với csdl vì đã xong
    }

    // JPQL : select x from student x where x.gpa = 8.4
    public static void getAllStudents() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.kienminh.superapp-PU");
        EntityManager em = emf.createEntityManager();
        List<Student> students = em.createQuery("from Student", Student.class).getResultList();
        System.out.println(students);
        students.forEach(System.out::println); // ✅ In rõ thông tin
        em.close();
    }
}