package Epicode.gestioneDipendenti.repositories;

import Epicode.gestioneDipendenti.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {

}
