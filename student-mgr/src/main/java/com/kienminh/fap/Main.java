package com.kienminh.fap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kienminh.fap.entity.Employee;
import com.kienminh.fap.entity.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student s1 = new Student("SE1", "An Nguyễn", 2004,8.6);
        System.out.println(s1);
        System.out.println(s1.toString());


        // xài các hàm tự generate trong class Employee
        Employee e1 = new Employee("SE1", "An Nguyễn", 2004,8.6);
        System.out.println(e1);
        System.out.println(e1.toString());

        // ta sẽ dùng thư viện JACKON, là bộ thư viện giúp ta làm việc với JSON theo 2 chiều


        // - từ object -> chuỗi json
        ObjectMapper mapper = new ObjectMapper();
        String e1Json = mapper.writeValueAsString(e1);
        //mapper là 1 obj có khả năng biến đổi 1 obj khác thành 1 String gọi là JSON
        System.out.println(e1Json);
        // từ chuỗi json -> object trong code
        String e2Json = """
                {"id":"E2","name":"Cường Võ","yob":2001,"salary":100000000.0}
                """;
        Employee e2 = mapper.readValue(e2Json, Employee.class);

        System.out.println(e2); //từ JSON thành obj



    }
}