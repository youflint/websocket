package com.wh.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application
{
	
	
  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
    System.out.print("Spring boot 启动成功");
  }
}
