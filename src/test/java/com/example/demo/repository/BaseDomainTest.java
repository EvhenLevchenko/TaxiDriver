package com.example.demo.repository;


import com.example.demo.domain.Car;
import com.example.demo.domain.Driver;
import com.example.demo.domain.Pasenger;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BaseDomainTest {

    @Autowired
    private EntityManager entityManager;// механизм для общения с БД самого JPA. Сам entityManager необходим только для тестов

    @Before
    public void setUp() throws Exception {
        Driver driver = Driver.builder()
                .name("driver name")
                .car(Car.builder()
                        .name("car name")
                        .build())
                .build();

        entityManager.persist(driver);
    }

    @Before
    public void setUpOne() throws Exception {
        Driver driver = Driver.builder()
                .name("Taxi driver")
                .pasenger(Pasenger.builder()
                        .name("Ivan")
                        .build())
                .build();
        entityManager.persist(driver);
    }
}
