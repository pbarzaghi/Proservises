package ar.programa.provices.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@lombok.Data
@lombok.RequiredArgsConstructor
@Entity
@Table(name="contrato")
public class Contrato {
    @Id
    @Column(name="id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id",referencedColumnName = "idPrestador")
    Prestador prestador;


    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name="id",referencedColumnName = "id")
    Consumidor consumidor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "servico",
            joinColumns = {
                    @JoinColumn(name = "id"),
            },
            inverseJoinColumns = @JoinColumn(name = "tareaId")
    )
    List<Tarea> tareas;

    @Column(name="precio")
    int precio;

    @Column(name="aceptacionTrabajo")
    boolean aceptoTrabajo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id",referencedColumnName = "idCalificacion")
    Review review;

    public Contrato(Prestador prestador,Consumidor consumidor){
        this.tareas=new ArrayList<>();
        this.consumidor=consumidor;
        this.prestador=prestador;
    }



}
