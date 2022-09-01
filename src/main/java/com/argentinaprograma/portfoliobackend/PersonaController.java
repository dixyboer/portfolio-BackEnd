package com.argentinaprograma.portfoliobackend;

import com.argentinaprograma.portfoliobackend.bd.Persona;
import com.argentinaprograma.portfoliobackend.bd.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/perfil")
    @CrossOrigin(origins = "*")
    public ResponseEntity miPerfil() {
        Optional<Persona> yo = personaRepository.findById("33636551");
        if (yo.isPresent()) {
            return ResponseEntity.ok(yo.get());
        }
        return ResponseEntity.internalServerError().build();
    }
}
