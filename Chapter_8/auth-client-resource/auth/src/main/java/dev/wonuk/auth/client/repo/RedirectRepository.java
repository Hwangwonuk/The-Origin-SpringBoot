package dev.wonuk.auth.client.repo;

import dev.wonuk.auth.client.entity.OAuthClientEntity;
import dev.wonuk.auth.client.entity.RedirectEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedirectRepository extends CrudRepository<RedirectEntity, Long> {
    List<RedirectEntity> findAllByClient(OAuthClientEntity client);
}
