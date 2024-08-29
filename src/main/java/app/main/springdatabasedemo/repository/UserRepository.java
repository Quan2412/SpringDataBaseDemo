package app.main.springdatabasedemo.repository;

import app.main.springdatabasedemo.entity.Job;
import app.main.springdatabasedemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}


