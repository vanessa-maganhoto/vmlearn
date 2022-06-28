package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
