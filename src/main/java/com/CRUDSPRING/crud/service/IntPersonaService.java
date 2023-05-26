package com.CRUDSPRING.crud.service;

import com.CRUDSPRING.crud.modells.Persona;

public interface IntPersonaService {
    Persona newPersona(Persona newPersona);
    Iterable<Persona> getAll();

    Persona modifyPErsona(Persona persona);
    Boolean deletePersona(Long idPersona);

}
