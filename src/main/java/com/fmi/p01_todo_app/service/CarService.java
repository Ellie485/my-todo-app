package com.fmi.p01_todo_app.service;

import com.fmi.p01_todo_app.model.Car;
import com.fmi.p01_todo_app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
    //Тук ще бъде логиката за обработка на данните и бизнес правилата (напр. калкулация на цената).
    // bisnes logic
}
