package com.kienminh.superapp.tightcoupling;

public class MainLooseCoupling {
    public static void main(String[] args) {
        //app swp có phần đăng kí member, GUI làm gì đso có đc in4 từ user, gọi Service giúp
        UserService userService = new UserService();
        userService.registerUser();
        // nhược điểm : code ko mở rộng được (Scale up) do A phụ thuộc B quá chặt

    }
}
