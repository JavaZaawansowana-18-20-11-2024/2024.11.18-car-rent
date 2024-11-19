package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.gui.GUIv2;
import com.comarch.szkolenia.car.rent.model.Car;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CarRepository implements CarRepositoryInterface {
    /*private GUIv2 guIv2;*/

    /*public CarRepository(GUIv2 guIv2) {
        this.guIv2 = guIv2;
    }*/

    @Getter
    private final List<Car> cars = new ArrayList<>();

    CarRepository() {
        this.cars.add(new Car("BMW", "3", 300.0, 2020, "KR11"));
        this.cars.add(new Car("Toyota", "Corolla", 200.0, 2021, "KR22"));
        this.cars.add(new Car("Kia", "Ceed", 250.0, 2022, "KR33"));
        this.cars.add(new Car("Honda", "Civic", 150.0, 2018, "KR44"));
    }

    public boolean rentCar(String plate) {
        return this.cars.stream()
                .filter(car -> car.plate().equals(plate))
                .filter(car -> !car.rent())
                .peek(car -> car.rent(true))
                .findFirst()
                .isPresent();
    }
}
