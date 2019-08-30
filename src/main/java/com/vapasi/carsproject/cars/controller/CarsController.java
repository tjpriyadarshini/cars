package com.vapasi.carsproject.cars.controller;

import com.vapasi.carsproject.cars.model.Cars;
import com.vapasi.carsproject.cars.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CarsController {

    @Autowired
    CarsRepository carsRepository;


    @GetMapping("/cars")
    @ResponseBody
    public ResponseEntity<List<Cars>> getCars() {

        List<Cars> cars = carsRepository.findAll();
        return ResponseEntity.ok().body(cars);
    }
/*
    @GetMapping("/cars")
    @ResponseBody
    public ResponseEntity<List<Cars>> getAllCars() {
        ResponseEntity<List<Cars>> result;

        result = ResponseEntity.ok(carsRepository.findAll());

        return result;
    }

 */
}
