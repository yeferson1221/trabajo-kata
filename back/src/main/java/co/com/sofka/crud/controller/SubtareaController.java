package co.com.sofka.crud.controller;

import co.com.sofka.crud.model.Subtareas;
import co.com.sofka.crud.service.SubtareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class SubtareaController {


        /**
         * Servicio para el manejo de los Subtarea.
         */
        @Autowired
        private SubtareaService service;


        @GetMapping(value = "api/subtareas")
        public List<Subtareas> list(){
            return service.list();
        }


        @PostMapping(value = "api/subtarea")
        public Subtareas save(@RequestBody Subtareas list){
            return service.save(list);
        }


        @PutMapping(value = "api/{id}/subtarea")
        public Subtareas update(@RequestBody Subtareas list){
            if(list.getId() != null){
                return service.save(list);
            }
            throw new RuntimeException("No existe el id para actualizar");
        }


        @DeleteMapping(value = "api/{id}/subtarea")
        public void delete(@PathVariable("id")Long id){
            service.delete(id);
        }


        @GetMapping(value = "api/{id}/subtarea")
        public Subtareas get(@PathVariable("id") Long id){
            return service.getListById(id);
        }

}
