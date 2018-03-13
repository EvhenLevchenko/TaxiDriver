package com.example.demo.repository;

import com.example.demo.domain.Pasenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasengerRepository extends JpaRepository<Pasenger,Integer> {
    Pasenger getByName(String name);
}
