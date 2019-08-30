package com.vapasi.carsproject.cars.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Models {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int model_id;

    private String modelName;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brands brand_id;

    private Types type_id;


    public Models(int model_id, String modelName, Brands brand_id, Types type_id) {
        this.model_id = model_id;
        this.modelName = modelName;
        this.brand_id = brand_id;
        this.type_id = type_id;
    }

    public int getModel_id() {
        return model_id;
    }

    public String getModelName() {
        return modelName;
    }

    /*@ManyToOne
    @JoinColumn(name="brand_id")*/
    public Brands getBrand_id() {
        return brand_id;
    }

    /*@ManyToOne
    @JoinColumn(name="type_id")*/
    public Types getType_id() {
        return type_id;
    }

    public Models() {
    }
}

