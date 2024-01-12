package com.icwd.user.service.repositories;

import com.icwd.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    //if you want to implement any custom method or query
    //write
}
