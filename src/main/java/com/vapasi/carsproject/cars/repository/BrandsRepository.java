package com.vapasi.carsproject.cars.repository;

import com.vapasi.carsproject.cars.model.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandsRepository extends JpaRepository<Brands, Integer> {
}
