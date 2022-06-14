package co.com.sofka.crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tareas")
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="complete")
    private Boolean completed;
    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Subtareas.class, optional = false)
    @JsonBackReference
    @JoinColumn(name = "category")
    private Subtareas groupListId;


}
