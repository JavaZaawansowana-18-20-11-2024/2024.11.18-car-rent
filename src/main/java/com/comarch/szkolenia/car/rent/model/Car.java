package com.comarch.szkolenia.car.rent.model;

import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(fluent = true)
public class Car {
    private String brand;
    private String model;
    private double price;
    private int year;
    private String plate;
    private boolean rent;

    public Car(String brand, String model, double price, int year, String plate) {
        this(brand, model, price, year, plate,false);
    }

    /*@Synchronized
    public void setPrice(double price) {
        //kod
        //kod
    }*/
}
