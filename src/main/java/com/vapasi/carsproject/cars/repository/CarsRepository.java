package com.vapasi.carsproject.cars.repository;

import com.vapasi.carsproject.cars.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {

}
