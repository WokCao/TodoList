package com.example.TodoList.Repositories;

import com.example.TodoList.Models.UserModel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT COUNT(u) > 0 FROM User u WHERE u.email = :email")
    boolean findByEmail(@Param("email") String email);
}
