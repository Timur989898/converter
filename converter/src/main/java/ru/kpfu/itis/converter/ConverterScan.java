package ru.kpfu.itis.converter;

import org.springframework.beans.factory.annotation.Autowired;

public class ConverterScan {

    @Autowired
    private Converter converter;


    public float getCurrency(float count) {
        return count * converter.getRate();
    }


}
