package com.kienminh.superapp.loosecoupling.di.v3finalfantasy;

public class WhatAppSender implements NotiSender{


    @Override
    public void sendNoti() {
        System.out.println("OCP: message is sent to WhatApp");
    }
}
