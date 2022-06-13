package co.com.sofka.crud.service;

import co.com.sofka.crud.model.Subtareas;
import co.com.sofka.crud.repository.SubtareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubtareaService {
    /**
     * Contiene el Repositorio de subtareas.
     */
    @Autowired
    SubtareasRepository repository;

    /**
     * Devuelve una lista con todos los Subtareas.
     *
     * @return lista con todos los Subtareas.
     *
     * @author Yeferson Valencia <Alejandro.yandd@gmail.com>
     * @since 1.0.0
     */
    @Transactional(readOnly = true)
    public List<Subtareas> list(){
        return repository.findAll();
    }

    /**
     * Guarda un nuevo Subtareas.
     *
     * @param list que se desea guardar.
     * @return Subtarea que fue guardado.
     */
    @Transactional
    public Subtareas save(Subtareas list){
        return repository.save(list);
    }

    /**
     * Devuelve una lista en base a su id.
     *
     * @param id de la lista que se desea encontrar.
     * @return Subtarea que fue obtenido.
     */
    @Transactional(readOnly = true)
    public Subtareas getListById(Long id){
        return repository.findById(id).orElseThrow();
    }

    /**
     * Borra una Subtarea con su id.
     *
     * @param id del Subtarea que se desea borrar
     *
     */
    @Transactional
    public void delete(Long id){
        repository.delete(getListById(id));
    }

}
