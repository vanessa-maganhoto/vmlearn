package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
