package com.comarch.szkolenia.car.rent.core;

import com.comarch.szkolenia.car.rent.database.CarRepositoryInterface;
import com.comarch.szkolenia.car.rent.gui.GUIInterface;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Core {
    private CarRepositoryInterface carRepository;
    private GUIInterface gui;

    public Core(CarRepositoryInterface carRepository,
                @Autowired(required = false) GUIInterface gui) {
        this.carRepository = carRepository;
        this.gui = gui;
    }

    public void run() {
        boolean run = true;
        while(run) {
            switch (this.gui.showManuAndReadChoose()) {
                case "1":
                    this.gui.listCars();
                    break;
                case "2":
                    this.gui.showResult(this.carRepository.rentCar(this.gui.askForPlate()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    this.gui.showWrongChooseMessage();
                    break;
            }
        }
    }
}
