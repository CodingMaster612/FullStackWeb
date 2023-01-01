package com.backend.Service;

import java.util.List;

import com.backend.Model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}