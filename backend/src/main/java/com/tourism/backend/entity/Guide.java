package com.tourism.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "guide")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guideID;

    private String name;
    private String contact;
    private String language;
    private boolean availability;
}
