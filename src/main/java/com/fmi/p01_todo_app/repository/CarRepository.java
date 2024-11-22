package com.fmi.p01_todo_app.repository;

import com.fmi.p01_todo_app.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Интерфейс за репозитория на Car
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Можете да добавяте custom методи, ако е необходимо
}
