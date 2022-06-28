package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
