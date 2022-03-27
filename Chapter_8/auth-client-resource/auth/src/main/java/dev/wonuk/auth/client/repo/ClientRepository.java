package dev.wonuk.auth.client.repo;

import dev.wonuk.auth.client.entity.OAuthClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<OAuthClientEntity, Long> {
    OAuthClientEntity findFirstByUid(String uid);
    OAuthClientEntity findFirstByClientId(String clientId);
}
