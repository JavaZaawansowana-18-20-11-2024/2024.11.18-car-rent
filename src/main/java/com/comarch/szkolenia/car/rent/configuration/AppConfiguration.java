package com.comarch.szkolenia.car.rent.configuration;

import com.comarch.szkolenia.car.rent.database.CarRepositoryInterface;
import com.comarch.szkolenia.car.rent.gui.GUIInterface;
import com.comarch.szkolenia.car.rent.gui.GUIv2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Scanner;

@Configuration
@ComponentScan({"com.comarch.szkolenia.car.rent.core",
        "com.comarch.szkolenia.car.rent.database",
        "com.comarch.szkolenia.car.rent.gui"})
//@ImportResource("beans.xml")
public class AppConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    /*@Bean("nowe_gui")
    public GUIInterface guiV2(CarRepositoryInterface carRepositoryInterface, Scanner scanner) {
        return new GUIv2(scanner, carRepositoryInterface);
    }*/
}
