package com.example.demo.repository;

import com.example.demo.domain.Car;
import com.example.demo.domain.Pasenger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PasengerRepositoryTest extends BaseDomainTest {

    @Autowired
    private PasengerRepository pasengerRepository;

    @Test
    public void findAll() {
        List<Pasenger> all = pasengerRepository.findAll();

        assertThat(all).hasSize(1);
    }

    @Test
    public void getByName() {

        Pasenger pasenger = pasengerRepository.getByName("Ivan");

        assertThat(pasenger).isNotNull();
    }
}
