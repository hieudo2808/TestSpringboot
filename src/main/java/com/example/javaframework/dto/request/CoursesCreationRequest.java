package com.example.javaframework.dto.request;

public class CoursesCreationRequest {
    private String course_id;
    private String course_name;
    private String semester;
    private float final_exam_score;
    private float process_score;
    private float coefficient;
    private int credits;

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
}
