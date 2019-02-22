package ru.kpfu.itis.converter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Scanner;

public class XmlConverterConfig {

    public static void main(String[] args) {
        new XmlConverterConfig();
    }

    public XmlConverterConfig(){
        Scanner sc = new Scanner(System.in);

        ApplicationContext context =
                new FileSystemXmlApplicationContext(getClass().getResource("/converterConfig.xml").toString());

        Converter obj = null;


        System.out.println("Enter: 1)Dollars 2)Euro");
        String currency = sc.nextLine();


        if (currency.equals("1")) {
            obj = (Converter) context.getBean("dollars");
        }

        if (currency.equals("2")) {
            obj = (Converter) context.getBean("euro");
        }

        System.out.println("Enter sum");
        float sum = sc.nextFloat();

        System.out.println(obj.getCurrency(sum));

        ApplicationContext contextScan = new ClassPathXmlApplicationContext("converterScanConfig.xml");
        ConverterScan scan = (ConverterScan) contextScan.getBean("converter");


        System.out.println(scan.getCurrency(10));
    }
}
