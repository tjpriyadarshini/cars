package com.vapasi.carsproject.cars.repository;

import com.vapasi.carsproject.cars.model.Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesRepository extends JpaRepository<Types,Integer> {
}
