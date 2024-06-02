package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);
    HelloWorld bean =
        (HelloWorld) applicationContext.getBean("helloworld");
    System.out.println(bean.getMessage());

    var helloworld =
        applicationContext.getBean("helloworld", HelloWorld.class);

    var cat1 = applicationContext.getBean("cat", Cat.class);
    var cat2 = applicationContext.getBean("cat", Cat.class);

    System.out.println(bean == helloworld);
    System.out.println(cat1 == cat2);
  }

}
