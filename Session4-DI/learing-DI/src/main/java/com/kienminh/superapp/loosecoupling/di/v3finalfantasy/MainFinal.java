package com.kienminh.superapp.loosecoupling.di.v3finalfantasy;

import com.kienminh.superapp.loosecoupling.di.v2.setter.SmsSender;

public class MainFinal {
    public static void main(String[] args) {
        SmsSender smsSender = new SmsSender();

        UserService userService = new UserService();
        userService.registerAccount();

        WhatAppSender whatAppSender = new WhatAppSender();
        UserService userService2 = new UserService(whatAppSender);
        userService2.registerAccount();
    }
}
