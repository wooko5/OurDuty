package project.ourduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ourduty.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findUsersByUsername(String username);
}
