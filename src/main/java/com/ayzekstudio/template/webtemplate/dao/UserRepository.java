package com.ayzekstudio.template.webtemplate.dao;

import com.ayzekstudio.template.webtemplate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    Long deleteByUsername(String username);

}
