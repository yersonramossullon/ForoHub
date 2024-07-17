package com.josemina.forohub.persistence.repository;

import com.josemina.forohub.persistence.entities.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Long> {

    List<Role> findRoleByRoleEnumIn(List<String> roles);
}
