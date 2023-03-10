package com.example.CourseManagement.repositories;

import com.example.CourseManagement.models.Booking;
import com.example.CourseManagement.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findByDate(String date);
}
