package com.example.demo.domain;


import lombok.*;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "passenger")
@Builder(toBuilder = true)
@Getter
@ToString
public class Pasenger implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

}
