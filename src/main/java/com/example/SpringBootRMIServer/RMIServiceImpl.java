package com.example.SpringBootRMIServer;

import java.util.Date;

public class RMIServiceImpl implements RMIService {


    @Override
    public String SayHello(String message) {
        System.out.println("==============SERVER IS RUNNING=============");
        System.out.println("Inside RMI Impl - Incoming message : " + message);
        return "Here is the message: "+message+"  ::Response time=>"+new Date();
    }
}
