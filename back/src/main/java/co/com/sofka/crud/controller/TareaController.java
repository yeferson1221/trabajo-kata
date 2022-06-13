package co.com.sofka.crud.controller;

import co.com.sofka.crud.model.Tareas;
import co.com.sofka.crud.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TareaController {
    @Autowired
    private TareaService service;

    @GetMapping(value = "api/todos")
    public Iterable<Tareas> list(){
        return service.list();
    }

    @PostMapping(value = "api/todo")
    public Tareas save(@RequestBody Tareas tarea){
        return service.save(tarea);
    }

    @PutMapping(value = "api/todo")
    public Tareas update(@RequestBody Tareas tarea){
        if(tarea.getId() != null){
            return service.save(tarea);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/todo")
    public Tareas get(@PathVariable("id") Long id){
        return service.get(id);
    }

}
