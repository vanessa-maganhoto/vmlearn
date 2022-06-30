package com.vanessamatos.vmlearn.resources;

import com.vanessamatos.vmlearn.dto.NotificationDTO;
import com.vanessamatos.vmlearn.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {

    @Autowired
    private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(Pageable pageable) {

        Page<NotificationDTO> page = service.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}