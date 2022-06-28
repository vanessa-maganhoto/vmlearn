package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
