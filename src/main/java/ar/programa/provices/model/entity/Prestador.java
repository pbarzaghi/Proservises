package ar.programa.provices.model.entity;

import ar.programa.provices.emun.CategoriaEnum;

import javax.persistence.*;
import java.util.List;

@lombok.Data
@lombok.NoArgsConstructor
@Entity
@Table(name="prestador")
public class Prestador {

    @Id
    @Column(name="idPrestador")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;



    @OneToOne
    @JoinColumn(name="id", referencedColumnName="idCategoria")
    Categoria categoria;

    @OneToOne
    @JoinColumn(name = "id",referencedColumnName = "idPerfil")
    Perfil perfil;

    @ManyToMany
    List<DiaLaboral> diasLaborales;

    @JoinColumn(name="horarioAtencion")
    String horarioLaboral;

    @OneToMany
    List<Contrato> contratos;

    @OneToMany
    List<FotoTrabajoRealizado> trabajosRealizados;


}
