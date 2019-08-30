package com.vapasi.carsproject.cars.model;

import javax.persistence.*;

import java.util.Set;


@Entity
public class Brands {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int brand_id;

    private String brand;

    @OneToMany(mappedBy = "brands", cascade = CascadeType.ALL)
    private Set<Brands> brands;

    public Brands(int brand_id, String brand) {
        this.brand_id = brand_id;
        this.brand = brand;
    }

    public Brands() {
    }

    public int getBrand_id() {
        return brand_id;
    }


    public String getBrand() {
        return brand;
    }
}





