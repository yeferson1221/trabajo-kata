package co.com.sofka.crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name="tareas")
public  class Tareas {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Getter
    @Setter
    @Column(name="name")
    private String name;
    @Getter
    @Setter
    @Column(name="complete")
    private Boolean completed;
    @Getter
    @Setter
    @OneToMany(fetch = FetchType.LAZY,targetEntity = Subtareas.class,cascade = CascadeType.REMOVE)
    @JoinColumn (name="subtareas_id")
    @JsonBackReference
    private Collection<Subtareas> subtareaListas;

    @Override
    public String toString() {
        return  name;

    }

}
