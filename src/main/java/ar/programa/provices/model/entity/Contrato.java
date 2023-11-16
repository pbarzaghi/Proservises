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
    //TODO realizar presentador en Contrato
    Prestador prestador;
    //TODO realizar Consumidor en Contrato
    Consumidor consumidor;
    //TODO realizar Lista Tarea en Contrato
    List<Tarea> tareas;
    @Column(name="precio")
    int precio;
    @Column(name="aceptacionTrabajo")
    boolean aceptoTrabajo;
    //TODO realizar Review en Contrato
    Review review;

    public Contrato(Prestador prestador,Consumidor consumidor){
        this.tareas=new ArrayList<>();
        this.consumidor=consumidor;
        this.prestador=prestador;
    }



}
