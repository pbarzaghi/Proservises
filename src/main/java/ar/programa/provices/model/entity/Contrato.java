package ar.programa.provices.model.entity;

import java.util.ArrayList;
import java.util.List;

@lombok.Data

@lombok.RequiredArgsConstructor
public class Contrato {
    int id;
    Prestador prestador;
    Consumidor consumidor;
    List<Tarea> tareas;
    int precio;
    boolean aceptoTrabajo;
    Review review;

    public Contrato(Prestador prestador,Consumidor consumidor){
        this.tareas=new ArrayList<>();
        this.consumidor=consumidor;
        this.prestador=prestador;
    }



}
