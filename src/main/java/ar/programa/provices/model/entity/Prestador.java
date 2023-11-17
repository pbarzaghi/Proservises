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



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id", referencedColumnName="idCategoria")
    Categoria categoria;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id",referencedColumnName = "idPerfil")
    Perfil perfil;

    @ManyToMany(cascade = CascadeType.ALL)
    List<DiaLaboral> diasLaborales;

    @JoinColumn(name="horarioAtencion")
    String horarioLaboral;

    @OneToMany(cascade = CascadeType.ALL)
    List<Contrato> contratos;


    @OneToMany(cascade = CascadeType.ALL)
    List<FotoTrabajoRealizado> trabajosRealizados;


}
