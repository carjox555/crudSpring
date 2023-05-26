package com.CRUDSPRING.crud.modells;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tbPersona")
@Getter @Setter
public class Persona {
    @Id
    private Long numDocumento;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String email;
}
