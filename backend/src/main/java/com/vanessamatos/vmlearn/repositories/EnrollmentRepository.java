package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Enrollment;
import com.vanessamatos.vmlearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
