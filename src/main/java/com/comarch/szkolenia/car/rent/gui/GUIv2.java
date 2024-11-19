package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.database.CarRepositoryInterface;
import org.springframework.stereotype.Component;

import java.util.Scanner;


public class GUIv2 implements GUIInterface {
    private final Scanner scanner;
    private final CarRepositoryInterface carRepository;

    public GUIv2(Scanner scanner, CarRepositoryInterface carRepository) {
        this.scanner = scanner;
        this.carRepository = carRepository;
    }

    /*public GUIv2(CarRepositoryInterface carRepository) {
        this.scanner = null;
        this.carRepository = carRepository;
    }*/

    public String showManuAndReadChoose() {
        System.out.println("1. list cars");
        System.out.println("2. rent car");
        System.out.println("3. exit");

        return this.scanner.nextLine();
    }

    public void listCars() {
        this.carRepository.getCars().forEach(System.out::println);
    }

    public String askForPlate() {
        System.out.println("enter plate:");

        return this.scanner.nextLine();
    }

    public void showResult(boolean result) {
        System.out.println(result ? "success" : "error");
    }

    public void showWrongChooseMessage() {
        System.out.println("wrong choose");
    }
}
