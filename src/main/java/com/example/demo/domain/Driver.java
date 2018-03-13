package com.example.demo.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "driver")
@Builder
@Getter
public class Driver implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Car> cars;

    @OneToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Pasenger> pasengers;
}
