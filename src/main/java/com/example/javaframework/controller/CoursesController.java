package com.example.javaframework.controller;

import com.example.javaframework.dto.request.CoursesCreationRequest;
import com.example.javaframework.entity.Courses;
import com.example.javaframework.repository.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @PostMapping
    Courses createCourse(@RequestBody CoursesCreationRequest courses) {
        return coursesService.createCourse(courses);
    }

    @GetMapping
    List<Courses> getAllCourses() {
        return coursesService.getAllCourses();
    }
}
