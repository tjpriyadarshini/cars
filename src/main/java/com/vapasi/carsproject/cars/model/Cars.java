package com.vapasi.carsproject.cars.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
public class Cars {

    @Id
    @GeneratedValue
    private int car_id;
    private String variant;
    private double original_price;
    private float discount;

    private Models model_id;

    @OneToOne
    @JoinColumn(name = "model_id")
    Models models;

    public int getCar_id() {
        return car_id;
    }

    public String getVariant() {
        return variant;
    }

    public double getOriginal_price() {
        return original_price;
    }

    public float getDiscount() {
        return discount;
    }

    public Models getModel_id() {
        return model_id;
    }

    public Models getModels() {
        return models;
    }

    public Cars(int car_id, String variant, double original_price, float discount, Models models,Models model_id) {
        this.car_id = car_id;
        this.variant = variant;
        this.original_price = original_price;
        this.discount = discount;
        this.models = models;
        this.model_id = model_id;
    }

}