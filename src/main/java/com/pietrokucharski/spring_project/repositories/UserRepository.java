package com.pietrokucharski.spring_project.repositories;

import com.pietrokucharski.spring_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
