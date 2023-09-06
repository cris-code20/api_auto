package com.autos.autosapi.dto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Autos, Long> {
}
