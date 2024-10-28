package com.projet.Detectify.Repository;

import com.projet.Detectify.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}