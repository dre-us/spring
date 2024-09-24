/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author acmalave
 */
@SpringBootApplication
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Mavenproject1.class, args);
    }
    
    public void run(String... args) throws Exception {
        System.out.println("Bienvenido a mi aplicativo con Spring Boot!");
    }
}
