package ru.kpfu.itis.converter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConverterConfig {

    @Bean
    public Converter dollars() {
        return new Converter(66);
    }

    @Bean
    public Converter euro() {
        return new Converter(83);
    }

}
