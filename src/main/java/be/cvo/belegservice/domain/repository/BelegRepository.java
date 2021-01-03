package be.cvo.belegservice.domain.repository;

import be.cvo.belegservice.domain.BelegEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BelegRepository extends JpaRepository<BelegEntity, Integer> {
}
