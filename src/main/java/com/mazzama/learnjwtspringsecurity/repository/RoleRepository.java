package com.mazzama.learnjwtspringsecurity.repository;

import com.mazzama.learnjwtspringsecurity.model.Role;
import com.mazzama.learnjwtspringsecurity.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
