DROP DATABASE CPA
CREATE DATABASE CPA
USE CPA
CREATE TABLE Users (
    user_id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
	CPA FLOAT
);
drop table Courses
CREATE TABLE Courses (
	semester VARCHAR(7),
    course_id VARCHAR(10) PRIMARY KEY NOT NULL,
    course_name NVARCHAR(50) NOT NULL,
    credits INT NOT NULL,
	coefficient DECIMAL(2,1) NOT NULL,
	process_score DECIMAL(3,1),
    final_exam_score DECIMAL(3,1),
    courses_score DECIMAL(4,2),
	courses_score_in4 DECIMAL(2,1),
    letter_grade VARCHAR(2)
);