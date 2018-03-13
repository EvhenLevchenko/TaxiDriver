package com.example.demo.repository;

import com.example.demo.domain.Car;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRepositoryTest extends BaseDomainTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void findAll() {
        List<Car> all = carRepository.findAll();

        assertThat(all).hasSize(1);
    }

    @Test
    public void getByName(){

        Car car=carRepository.getByName("car name");

        assertThat(car).isNotNull();
    }
}
