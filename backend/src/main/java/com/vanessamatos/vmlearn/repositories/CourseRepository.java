package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
