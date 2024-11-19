package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.configuration.AppConfiguration;
import com.comarch.szkolenia.car.rent.core.Core;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Core core = context.getBean(Core.class);
        core.run();
    }
}
