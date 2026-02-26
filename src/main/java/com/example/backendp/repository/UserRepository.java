package com.example.backendp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backendp.Users;

public interface UserRepository extends JpaRepository<Users, Integer>
{
    Users findByEmail(String email);
    
}
