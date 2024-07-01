package pl.pcz.taboo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pcz.taboo.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
