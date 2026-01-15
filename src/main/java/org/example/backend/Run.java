package org.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
        System.out.println("Server is running...");

        Runtime runtime = Runtime.getRuntime();

        long max = runtime.maxMemory();     
        long total = runtime.totalMemory(); 
        long free = runtime.freeMemory();   
        long used = total - free;      

        System.out.println("===== JVM MEMORY =====");
        System.out.println("Max Memory  : " + max / 1024 / 1024 + " MB");
        System.out.println("Total Memory: " + total / 1024 / 1024 + " MB");
        System.out.println("Used Memory : " + used / 1024 / 1024 + " MB");
    }
}
