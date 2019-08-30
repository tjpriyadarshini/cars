package com.vapasi.carsproject.cars.repository;

import com.vapasi.carsproject.cars.model.Models;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelsRepository extends JpaRepository<Models,Integer> {
}
