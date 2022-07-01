package com.vanessamatos.vmlearn.services;

import com.vanessamatos.vmlearn.dto.DeliverRevisionDTO;
import com.vanessamatos.vmlearn.entities.Deliver;
import com.vanessamatos.vmlearn.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        Deliver deliver = repository.getOne(id);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        repository.save(deliver);
    }
}
