package com.example.CourseManagement.components;

import com.example.CourseManagement.models.Booking;
import com.example.CourseManagement.models.Course;
import com.example.CourseManagement.repositories.BookingRepository;
import com.example.CourseManagement.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }
    public void run(ApplicationArguments args){
        Course maths = new Course("higher maths", "Dunbar", 5);
        courseRepository.save(maths);
        Course softwareDevelopment = new Course("Software Development", "Edinburgh", 4 );
        courseRepository.save(softwareDevelopment);
        Booking booking1 = new Booking("12/03/2023",maths);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("22/03/2023",maths);
        bookingRepository.save(booking2);

    }

}
