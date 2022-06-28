package com.vanessamatos.vmlearn.repositories;

import com.vanessamatos.vmlearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
