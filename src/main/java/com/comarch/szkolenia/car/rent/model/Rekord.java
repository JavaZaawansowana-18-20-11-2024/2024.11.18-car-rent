package com.comarch.szkolenia.car.rent.model;

import lombok.Builder;

@Builder
public record Rekord(int id, String name, String surname) {

    public void cos() {
        System.out.println("cos");
        System.out.println(this.name);
        //this.name = "Cos";
    }
}
