package co.com.sofka.crud.controller;

import co.com.sofka.crud.model.Tareas;
import co.com.sofka.crud.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public  class TareaController {
    @Autowired
    private TareaService service;

    @GetMapping(value = "api/tareas")
    public Iterable<Tareas> list(){
        return service.list();
    }

    @PostMapping(value = "api/tarea")
    public Tareas save(@RequestBody Tareas tarea){
        return service.save(tarea);
    }

    @PutMapping(value = "api/tarea")
    public Tareas update(@RequestBody Tareas tarea){
        if(tarea.getId() != null){
            return service.save(tarea);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/tarea")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/tarea")
    public Tareas get(@PathVariable("id") Long id){
        return service.get(id);
    }

}
