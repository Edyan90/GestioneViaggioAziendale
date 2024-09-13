package Epicode.gestioneDipendenti.controllers;

import Epicode.gestioneDipendenti.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {
    @Autowired
    PrenotazioneService prenotazioneService;
}
