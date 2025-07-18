package com.kienminh.superapp.loosecoupling.di.v1.constructor;

public class MainConstructor {
    public static void main(String[] args) {
        // new 2 obj : new EmailSender() để cps pbj fill vào Service

        EmailSender emailSender = new EmailSender();

        UserService userService = new UserService(emailSender);

        userService.registerAccount();

        // hàm main lúc này đóng vai tạo, lưu và obj dependency EmailSernder 
    }
}
