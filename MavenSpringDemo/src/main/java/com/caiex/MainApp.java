package com.caiex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();
   }
}

// $ mvn clean compile assembly:single
// $ java -cp .;target\Cross-Test-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.caiex.Cross.MainApp
