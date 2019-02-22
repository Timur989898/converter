package ru.kpfu.itis.converter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class JavaConverterConfig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ConverterConfig.class);
        Converter obj = null;


        System.out.println("Enter: 1)Dollars 2)Euro");
        String currencyName = sc.nextLine();


        if (currencyName.equals("1")) {
           obj = (Converter) context.getBean("dollars");
        }

        if (currencyName.equals("2")) {
           obj = (Converter) context.getBean("euro");
        }

        System.out.println("Enter sum");
        float sum = sc.nextFloat();

        System.out.println(obj.getCurrency(sum));

    }

}
