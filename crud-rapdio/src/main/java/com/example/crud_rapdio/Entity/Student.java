package com.example.crud_rapdio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "table_student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;

    private String firstName;

    private String LastName;

    @Column(name="eamil_address", unique = true, nullable = false)
    private String email;
}
