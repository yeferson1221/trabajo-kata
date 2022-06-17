package co.com.sofka.crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subtareas")
public  class Subtareas {
    /**
     * Identificador del Subtarea
     */
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    /**
     * Nombre del Subtarea
     */
    @Getter
    @Setter
    @Column(name="name")
    private String name;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="subtareas_id",nullable = false)
    private Tareas tareas;

    /**
     * Relación de uno a muchos con la entidad tareas.
     */
    @Override
    public String toString() {
        return  name;

    }
}
