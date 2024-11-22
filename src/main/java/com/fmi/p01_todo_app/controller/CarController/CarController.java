package com.fmi.p01_todo_app.controller.CarController;

import com.fmi.p01_todo_app.model.Car;
import com.fmi.p01_todo_app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.fmi.p01_todo_app.model.Car;
import com.fmi.p01_todo_app.service.CarService;


import java.util.List;

@RestController // Това прави класа RESTful контролер
@RequestMapping("/cars") // Основният маршрут, на който ще бъдат изпращани заявките
public class CarController {

    private final CarService carService;

    // Използваме конструктора за инжектиране на зависимостта CarService
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    // Метод за получаване на всички автомобили
    @GetMapping // Това казва на Spring, че методът ще обработва GET заявки
    public List<Car> getCars() {
        return carService.getAllCars(); // Връща всички автомобили от CarService
    }

}
