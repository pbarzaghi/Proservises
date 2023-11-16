package ar.programa.provices.model.entity;

import javax.persistence.*;

@lombok.Data
@lombok.NoArgsConstructor
@Entity
@Table(name="fototrabajorealizado")
public class FotoTrabajoRealizado {
    @Id
    @Column(name="idFotoTrabajoRealizado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="foto")
    String foto;
    //TODO: falta prestador en la clase FotoTrabajoRealizado
    Prestador prestador;
}