package com.vapasi.carsproject.cars.model;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Types {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int type_id;

    private String type;


    @OneToMany(mappedBy = "types",cascade = CascadeType.ALL)
    private Set<Types> types;

    public Types(int type_id, String type) {
        this.type_id = type_id;
        this.type = type;
    }

    public int getType_id() {
        return type_id;
    }

    public Types() {
    }

    public String getType() {
        return type;
    }

}


