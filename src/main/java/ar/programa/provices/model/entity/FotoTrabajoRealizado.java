package ar.programa.provices.model.entity;

@lombok.Data
@lombok.NoArgsConstructor
public class FotoTrabajoRealizado {
    int id;
    String foto;
    Prestador prestador;
}
