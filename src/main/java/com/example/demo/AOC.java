package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOC {



    @Before("execution(* get*())")
    public void aspectAdvice() {
        System.out.println("Получен бук");
    }

}
