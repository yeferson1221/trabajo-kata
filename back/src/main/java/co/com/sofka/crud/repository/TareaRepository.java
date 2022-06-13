package co.com.sofka.crud.repository;

import co.com.sofka.crud.model.Tareas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends CrudRepository<Tareas, Long> {
}
