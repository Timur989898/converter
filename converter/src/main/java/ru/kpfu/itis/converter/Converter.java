package ru.kpfu.itis.converter;

import org.springframework.stereotype.Component;

@Component
public class Converter {
    private float rate = 66;

    public Converter() {
    }

    public Converter(float rate) {
        this.rate = rate;
    }

    public float getCurrency(float count) {
        return count * this.rate;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
