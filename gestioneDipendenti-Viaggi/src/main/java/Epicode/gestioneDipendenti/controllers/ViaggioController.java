package Epicode.gestioneDipendenti.controllers;

import Epicode.gestioneDipendenti.services.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viaggi")
public class ViaggioController {
    @Autowired
    ViaggioService viaggioService;
}
