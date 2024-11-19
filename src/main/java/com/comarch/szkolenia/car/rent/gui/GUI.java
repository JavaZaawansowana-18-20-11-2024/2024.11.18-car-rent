package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.database.CarRepositoryInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component("gui")
public class GUI implements GUIInterface {
    private final Scanner scanner;
    private final CarRepositoryInterface carRepository;

    public GUI(Scanner scanner, CarRepositoryInterface carRepository) {
        this.scanner = scanner;
        this.carRepository = carRepository;
    }

    public String showManuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return this.scanner.nextLine();
    }

    public void listCars() {
        this.carRepository.getCars().forEach(System.out::println);
    }

    public String askForPlate() {
        System.out.println("Enter plate:");

        return this.scanner.nextLine();
    }

    public void showResult(boolean result) {
        System.out.println(result ? "Success" : "Error");
    }

    public void showWrongChooseMessage() {
        System.out.println("Wrong choose");
    }
}
