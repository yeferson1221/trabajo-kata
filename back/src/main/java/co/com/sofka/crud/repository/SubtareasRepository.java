package co.com.sofka.crud.repository;

import co.com.sofka.crud.model.Subtareas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubtareasRepository extends CrudRepository<Subtareas, Long> {
}
