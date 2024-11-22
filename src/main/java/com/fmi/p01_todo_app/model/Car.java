package com.fmi.p01_todo_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    private Long id;
    private String make;
    private String model;
    private int year;

    // Конструктори, гетъри и сетъри

    public Car(Long id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // гетъри и сетъри за всички полета
}
