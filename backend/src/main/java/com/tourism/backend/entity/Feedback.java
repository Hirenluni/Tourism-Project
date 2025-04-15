package com.tourism.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "feedback")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedbackID;

    private int userID;
    private int packageID;
    private int rating;

    @Column(columnDefinition = "TEXT")
    private String comments;
}
