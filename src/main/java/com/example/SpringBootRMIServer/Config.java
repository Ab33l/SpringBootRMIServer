package com.example.SpringBootRMIServer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class Config {

    @Bean
    RemoteExporter RegisterRMIExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("SendMessageRMI");
        exporter.setServiceInterface(RMIService.class);
        exporter.setService(new RMIServiceImpl());
        return exporter;
    }

}

