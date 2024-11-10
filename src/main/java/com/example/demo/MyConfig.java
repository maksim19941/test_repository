package com.example.demo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.example.demo")
@Configuration
@EnableAspectJAutoProxy
public class MyConfig {
}
