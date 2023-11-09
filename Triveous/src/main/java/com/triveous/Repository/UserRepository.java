package com.triveous.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triveous.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
