package com.example.javaframework.repository.services;

import com.example.javaframework.dto.request.CoursesCreationRequest;
import com.example.javaframework.entity.Courses;
import com.example.javaframework.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    public Courses createCourse(CoursesCreationRequest course) {
        Courses newCourse = new Courses();

        newCourse.setCourseId(course.getCourseId());
        newCourse.setCourseName(course.getCourseName());
        newCourse.setCoefficient(course.getCoefficient());
        newCourse.setCredits(course.getCredits());
        newCourse.setProcessScore(course.getProcessScore());
        newCourse.setFinalExamScore(course.getFinalExamScore());
        newCourse.setSemester(course.getSemester());
        newCourse.setUserId(course.getUserId());

        return coursesRepository.save(newCourse);
    }

    public List<Courses> getAllCourses() {
        return coursesRepository.findAll();
    }

    public Courses getCourseById(String courseId) {
        return coursesRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));
    }
}
