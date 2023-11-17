package ar.programa.provices.model.entity;

import ar.programa.provices.emun.TipoDocEnum;

import javax.persistence.*;
import java.time.LocalDateTime;
@lombok.Data
@lombok.NoArgsConstructor
@Entity
@Table(name="perfil")
public class Perfil {
    @Id
    @Column(name="idPerfil")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="nombre")
    String nombre;
    @Column(name="apellido")
    String apellido;
    @Column(name="tel")
    String tel;
    @Column(name="mail")
    String email;

    //TODO Falta hacer tipo Doc en Perfil
    TipoDocEnum tipoDoc;

    @Column(name="NroDoc")
    String nroDoc;

    @Column(name="NroCuilCuit")
    String nroCuit;

    @Column(name="fechaNacimientol")
    LocalDateTime fechaNacimiento;

    @Column(name="fotoPerfil")
    String fotoPerfil;



}
