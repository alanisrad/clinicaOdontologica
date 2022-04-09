package com.example.clinicaOdontologica.repository.impl;

import com.example.clinicaOdontologica.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDentistRepository extends JpaRepository<Dentist, Integer> {
}
