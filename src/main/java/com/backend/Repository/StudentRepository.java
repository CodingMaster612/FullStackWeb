package com.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
