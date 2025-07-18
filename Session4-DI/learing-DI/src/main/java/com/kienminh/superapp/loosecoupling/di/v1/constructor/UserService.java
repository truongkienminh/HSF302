package com.kienminh.superapp.loosecoupling.di.v1.constructor;

public class UserService {
    // Mình cần gửi mail, gửi cả SMS tùy vào option của user đăng kí Member

    private EmailSender emailSender;

    public UserService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
    public void registerAccount(){
        emailSender.sendEmail();
    }
}
