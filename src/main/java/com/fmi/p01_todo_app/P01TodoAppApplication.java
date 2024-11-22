package com.fmi.p01_todo_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmi.p01_todo_app.model.Car;
import java.util.List;

@SpringBootApplication
public class P01TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(P01TodoAppApplication.class, args);
	}

}
