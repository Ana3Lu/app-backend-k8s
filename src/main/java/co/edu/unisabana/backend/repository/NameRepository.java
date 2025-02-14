package co.edu.unisabana.backend.repository;

import co.edu.unisabana.backend.entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
