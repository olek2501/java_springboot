package com.example.Praktyki7MapperDTO.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Praktyki7MapperDTO.entity.Users;
import org.springframework.stereotype.Repository;
//import java.awt.print.Hurtownia;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    // <Optional>

}
