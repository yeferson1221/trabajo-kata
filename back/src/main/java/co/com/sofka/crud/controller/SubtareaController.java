package co.com.sofka.crud.controller;

import co.com.sofka.crud.model.Subtareas;
import co.com.sofka.crud.service.SubtareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SubtareaController {
    @RestController
    @CrossOrigin(origins = "http://localhost:3000")
    public final class TodoListController {

        /**
         * Servicio para el manejo de los Subtarea.
         */
        @Autowired
        private SubtareaService service;


        @GetMapping(value = "api/todoList")
        public List<Subtareas> list(){
            return service.list();
        }


        @PostMapping(value = "api/todoList")
        public Subtareas save(@RequestBody Subtareas list){
            return service.save(list);
        }


        @PutMapping(value = "api/todoList")
        public Subtareas update(@RequestBody Subtareas list){
            if(list.getId() != null){
                return service.save(list);
            }
            throw new RuntimeException("No existe el id para actualizar");
        }


        @DeleteMapping(value = "api/{id}/todoList")
        public void delete(@PathVariable("id")Long id){
            service.delete(id);
        }


        @GetMapping(value = "api/{id}/todoList")
        public Subtareas get(@PathVariable("id") Long id){
            return service.getListById(id);
        }
    }
}
