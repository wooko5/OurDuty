package project.ourduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ourduty.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUsersByUsername(String username);
}
