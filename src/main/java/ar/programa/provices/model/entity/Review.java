package ar.programa.provices.model.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;

@lombok.Data
@lombok.NoArgsConstructor
@Entity
@Table (name = "review")
public class Review {
    @Id
    @Column (name ="idCalificacion" )
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    int id;

    @Column (name ="puntaje" )
    String puntaje;

    @Column (name ="opinion" )
    String opimion;



}
