package co.com.sofka.crud.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subtareas")
public final class Subtareas {
    /**
     * Identificador del Subtarea
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del Subtarea
     */
    private String name;

    /**
     * Relación de uno a muchos con la entidad tareas.
     */
    @OneToMany(
            mappedBy = "groupListId",
            targetEntity = Tareas.class,
            cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER
    )
    @JsonManagedReference
    private Set<Tareas> tareas;

}
