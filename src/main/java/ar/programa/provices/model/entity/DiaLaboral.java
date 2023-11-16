package ar.programa.provices.model.entity;

import ar.programa.provices.emun.DiaLaboralEnum;

import java.util.List;
@lombok.Data

@lombok.NoArgsConstructor

public class DiaLaboral {

    int id;
    DiaLaboralEnum dialaboral;
    String horarioAtencion;
    List<Prestador> prestadores;

}
