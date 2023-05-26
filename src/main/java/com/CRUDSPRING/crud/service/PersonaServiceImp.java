package com.CRUDSPRING.crud.service;

import com.CRUDSPRING.crud.modells.Persona;
import com.CRUDSPRING.crud.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PersonaServiceImp implements IntPersonaService {

    private PersonaRepository personaRepository;
    @Override
    public Persona newPersona(Persona newPersona) {
        return personaRepository.save(newPersona);
    }

    @Override
    public Iterable<Persona> getAll() {
        return this.personaRepository.findAll();
    }

    @Override
    public Persona modifyPErsona(Persona persona) {
        //Saber si esta dento de la BD
        Optional<Persona> personaEncontrada=this.personaRepository.findById(persona.getNumDocumento());
        if(personaEncontrada.get() != null){
            personaEncontrada.get().setNombre(persona.getNombre());
            personaEncontrada.get().setApellido(persona.getApellido());
            personaEncontrada.get().setEmail(persona.getEmail());
            personaEncontrada.get().setNombre(persona.getNombre());
            return  this.newPersona(personaEncontrada.get());
        }
        return null ;
    }

    @Override
    public Boolean deletePersona(Long idPersona) {
         this.personaRepository.deleteById(idPersona);
         return true;
    }
}
