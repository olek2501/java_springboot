package com.example.Praktyki7MapperDTO.repository;


import com.example.Praktyki7MapperDTO.entity.Samochod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamochodRepository extends JpaRepository<Samochod, Long> {

}
