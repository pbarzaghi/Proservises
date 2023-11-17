package ar.programa.provices.model.entity;

import ar.programa.provices.emun.DiaLaboralEnum;

import javax.persistence.*;
import java.util.List;
@lombok.Data


@Entity
@Table (name="diaslabolares")
public class DiaLaboral {
    @Id
    @Column(name="id")
    @GeneratedValue (strategy = GenerationType.AUTO)
    int id;


    //TODO falta realizar el nun, nombre columna nombre
    DiaLaboralEnum dialaboral;




    @ManyToMany(mappedBy="diasLaborales")
    List<Prestador> prestadores;

}
