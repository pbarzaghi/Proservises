package ar.programa.provices.model.entity;

import javax.persistence.*;
import java.util.List;

@lombok.Data
@lombok.NoArgsConstructor
@Entity
@Table (name="consumidor")
public class Consumidor {

    @Id
    @Column(name="id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;

    @Column(name="nombreyApellido")
    String nombreyapellido;

    @Column(name="direccion")
    String direccion;

    @Column(name="tel")
    String tel;

    @OneToMany(cascade = CascadeType.ALL)
    List<Contrato> contratos;

}
