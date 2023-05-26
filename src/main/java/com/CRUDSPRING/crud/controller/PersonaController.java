package com.CRUDSPRING.crud.controller;

import com.CRUDSPRING.crud.modells.Persona;
import com.CRUDSPRING.crud.service.PersonaServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PersonaController {

    private PersonaServiceImp personaServiceImp;

    @PostMapping("/nuevo")
    public Persona newPersona(@RequestBody Persona newPersona){
        return this.personaServiceImp.newPersona(newPersona);
    }
    @GetMapping("/mostrar")
    public Iterable<Persona>getAll(){
        return personaServiceImp.getAll();
    }
    @PostMapping("/update")
    public Persona updatePersona(Persona persona){
        return this.personaServiceImp.modifyPErsona(persona);
    }
    @PostMapping(value="/{id}")
    public Boolean deletePersona(@PathVariable(value="id")  Long idPersona){
        return this.personaServiceImp.deletePersona(idPersona);
    }
}
