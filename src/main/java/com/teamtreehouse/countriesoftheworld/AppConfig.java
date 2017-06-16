package com.teamtreehouse.countriesoftheworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Rumy on 5/29/2017.
 */
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void main(String[] args) {

        SpringApplication.run(AppConfig.class,args);
    }

}
