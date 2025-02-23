package com.example.javaframework.entity;

import jakarta.persistence.*;

@Entity
public class Courses {
    @Id
    private String course_id;
    private String course_name;
    private String semester;
    private float final_exam_score;
    private float process_score;
    private float coefficient;
    private int credits;
    private Long user_id;

    @Column(insertable = false, updatable = false)
    private String letter_grade;
    @Column(insertable = false, updatable = false)
    private Double courses_score_in4;
    @Column(insertable = false, updatable = false)
    private Double courses_score;

    public String getCourseId() {
        return course_id;
    }

    public void setCourseId(String course_id) {
        this.course_id = course_id;
    }

    public String getCourseName() {
        return course_name;
    }

    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public float getFinalExamScore() {
        return final_exam_score;
    }

    public void setFinalExamScore(float final_exam_score) {
        this.final_exam_score = final_exam_score;
    }

    public float getProcessScore() {
        return process_score;
    }

    public void setProcessScore(float process_score) {
        this.process_score = process_score;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(float coefficient) {
        this.coefficient = coefficient;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getLetterGrade() {
        return letter_grade;
    }

    public void setLetterGrade(String letter_grade) {
        this.letter_grade = letter_grade;
    }

    public Double getCoursesScoreIn4() {
        return courses_score_in4;
    }

    public void setCoursesScoreIn4(Double courses_score_in4) {
        this.courses_score_in4 = courses_score_in4;
    }

    public Double getCoursesScore() {
        return courses_score;
    }

    public void setCoursesScore(Double courses_score) {
        this.courses_score = courses_score;
    }

    public Long getUserId() {
        return user_id;
    }

    public void setUserId(Long user_id) {
        this.user_id = user_id;
    }
}
