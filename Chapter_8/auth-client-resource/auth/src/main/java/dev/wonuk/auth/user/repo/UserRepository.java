package dev.wonuk.auth.user.repo;

import dev.wonuk.auth.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
    boolean existsByUsername(String username);
}
