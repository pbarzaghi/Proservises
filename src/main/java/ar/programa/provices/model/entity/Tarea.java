package ar.programa.provices.model.entity;

import ar.programa.provices.emun.CategoriaEnum;

import javax.persistence.*;
import java.util.List;

@lombok.Data
@lombok.NoArgsConstructor

@Entity
@Table (name="tarea")

public class Tarea {
    @Id
    @Column (name="idTarea")
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    int id;


    @Enumerated(value = EnumType.STRING)
    CategoriaEnum categoria;
   @Column (name="descripcion")
    String  descripcionTarea;

    @ManyToMany(cascade = CascadeType.ALL)
    List<Contrato> contratos;


}
