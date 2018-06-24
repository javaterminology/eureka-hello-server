package com.terminology.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@ComponentScan(basePackages="com.terminology")
@SpringBootApplication
public class EurekaServerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApplication.class, args);
        
    }
}
