package org.launchcode.artgallery.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// CommentRepository.java
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Review review;

    private String content;
    private String author;
    private LocalDateTime timestamp;

    // getters and setters
}