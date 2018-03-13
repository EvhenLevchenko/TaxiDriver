package com.example.demo.repository;

import com.example.demo.domain.Driver;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DriverRepositoryTest extends BaseDomainTest {

    @Autowired
    private  DriverRepository driverRepository;

    @Test
    public void findAll(){
        List<Driver> all=driverRepository.findAll();

        assertThat(all).hasSize(2);
    }
}
