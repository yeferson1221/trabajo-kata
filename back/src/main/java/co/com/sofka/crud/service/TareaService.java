package co.com.sofka.crud.service;
import co.com.sofka.crud.model.Tareas;
import co.com.sofka.crud.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService {
    @Autowired
    private TareaRepository repository;

    public Iterable<Tareas> list(){
        return repository.findAll();
    }

    public Tareas save(Tareas tarea){
        return repository.save(tarea);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public Tareas get(Long id){
        return repository.findById(id).orElseThrow();
    }
}
