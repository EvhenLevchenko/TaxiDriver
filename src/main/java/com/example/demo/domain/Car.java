package com.example.demo.domain;

import lombok.*;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "car")
@Builder(toBuilder = true)
@Getter
@ToString
public class Car implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;
}
