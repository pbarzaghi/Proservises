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


    @Enumerated(value = EnumType.STRING)
    DiaLaboralEnum dialaboral;




    @ManyToMany(mappedBy="diasLaborales",cascade = CascadeType.ALL)
    List<Prestador> prestadores;

}
