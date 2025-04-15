package com.tourism.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "package")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int packageID;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private double price;
    private String location;
    private boolean availability;
}
