package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
