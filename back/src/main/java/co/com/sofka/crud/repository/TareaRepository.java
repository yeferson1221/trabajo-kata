package co.com.sofka.crud.repository;

import co.com.sofka.crud.model.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tareas, Long> {
}
