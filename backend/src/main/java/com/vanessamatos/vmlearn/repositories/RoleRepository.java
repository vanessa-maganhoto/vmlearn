package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
