package ar.programa.provices.model.entity;

import ar.programa.provices.emun.TipoDocEnum;

import java.time.LocalDateTime;
@lombok.Data

@lombok.NoArgsConstructor

public class Perfil {
    int id;
    String nombre;
    String apellido;
    String tel;
    String email;
    TipoDocEnum tipoDoc;
    String nroDoc;
    LocalDateTime fechaNacimiento;
    String fotoPerfil;

}
