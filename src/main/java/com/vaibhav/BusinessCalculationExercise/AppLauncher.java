package com.vaibhav.BusinessCalculationExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class AppLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(AppLauncher.class)) {
            var businessCalculationService = context.getBean(BusinessCalculationService.class);
            int max = businessCalculationService.findMax();

            System.out.println(max);
        }
    }
}
