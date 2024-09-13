package Epicode.gestioneDipendenti.services;

import Epicode.gestioneDipendenti.repositories.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DipendenteService {
    @Autowired
    DipendenteRepository dipendenteRepository;
}
