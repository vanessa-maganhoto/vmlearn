package com.vanessamatos.vmlearn.services;

import com.vanessamatos.vmlearn.dto.NotificationDTO;
import com.vanessamatos.vmlearn.entities.Notification;
import com.vanessamatos.vmlearn.entities.User;
import com.vanessamatos.vmlearn.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository repository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable) {
        User user = authService.authenticated();
        Page<Notification> page = repository.findByUser(user, pageable);
        return page.map(x -> new NotificationDTO(x));
    }
}
