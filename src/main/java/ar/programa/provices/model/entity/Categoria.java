package ar.programa.provices.model.entity;

import ar.programa.provices.emun.CategoriaEnum;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@lombok.Data
@lombok.NoArgsConstructor
@Entity
@Table (name="categoria")
public class Categoria {
    @Id
    @Column (name="idCategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


      @Enumerated(value = EnumType.STRING)
       CategoriaEnum categoriaEnum;

}
