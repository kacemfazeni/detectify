package com.projet.Detectify.Repository;

import com.projet.Detectify.Model.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
