package josehomenhuck.spring_auth_jwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import josehomenhuck.spring_auth_jwt.model.User;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}
