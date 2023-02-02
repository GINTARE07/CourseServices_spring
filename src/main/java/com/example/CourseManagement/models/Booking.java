package com.example.CourseManagement.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private String date;
    @ManyToOne
    @JoinColumn(name = "course_id",nullable = false)
    @JsonIgnoreProperties({"bookings"})
    private Course course;

    public Booking(String date,Course course) {
        this.date = date;
        this.course = course;

    }
    public Booking(){}

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
