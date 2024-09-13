package Epicode.gestioneDipendenti.services;

import Epicode.gestioneDipendenti.repositories.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaggioService {
    @Autowired
    ViaggioRepository viaggioRepository;
}
