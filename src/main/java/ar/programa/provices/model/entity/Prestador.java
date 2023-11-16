package ar.programa.provices.model.entity;

import ar.programa.provices.emun.CategoriaEnum;

import java.util.List;

@lombok.Data

@lombok.NoArgsConstructor
public class Prestador {
    int id;
    CategoriaEnum categoria;
    Perfil perfil;
    List<DiaLaboral> diasLaborales;
    String horarioLaboral;
    List<Contrato> contratos;
    List<FotoTrabajoRealizado> trabajosRealizados;


}
