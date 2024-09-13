package Epicode.gestioneDipendenti.repositories;

import Epicode.gestioneDipendenti.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DipendenteRepository extends JpaRepository<Dipendente, UUID> {
}
