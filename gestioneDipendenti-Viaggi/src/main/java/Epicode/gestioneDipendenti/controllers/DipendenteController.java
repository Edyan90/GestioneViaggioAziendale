package Epicode.gestioneDipendenti.controllers;

import Epicode.gestioneDipendenti.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {
    @Autowired
    DipendenteService dipendenteService;
}
