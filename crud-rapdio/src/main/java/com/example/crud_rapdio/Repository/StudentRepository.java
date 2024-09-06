package com.example.crud_rapdio.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud_rapdio.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    
} 