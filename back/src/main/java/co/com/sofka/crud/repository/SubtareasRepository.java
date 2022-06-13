package co.com.sofka.crud.repository;

import co.com.sofka.crud.model.Subtareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtareasRepository extends JpaRepository<Subtareas, Long> {
}
