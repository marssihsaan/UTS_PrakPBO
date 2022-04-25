package com.example.forgotpassword.repository;

import com.example.forgotpassword.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
