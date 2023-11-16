package ar.programa.provices.model.entity;

import ar.programa.provices.emun.CategoriaEnum;

import java.util.List;

@lombok.Data

@lombok.NoArgsConstructor
public class Tarea {
    int id;
    CategoriaEnum categoria;
    String  descripcionTarea;
    List<Contrato> contratos;
}
