package io.eele.walnut.traditional;

import io.eele.walnut.traditional.dto.CollectInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<CollectInfo, Long> {
}
