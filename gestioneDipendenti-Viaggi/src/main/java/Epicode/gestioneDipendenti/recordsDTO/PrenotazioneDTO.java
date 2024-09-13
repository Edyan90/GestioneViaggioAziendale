package Epicode.gestioneDipendenti.recordsDTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record PrenotazioneDTO(
        @NotNull(message = "manca l'id del viaggio!")
        UUID viaggioID,
        @NotNull(message = "manca l'id del dipendente!")
        UUID dipendenteID,
        @NotEmpty(message = "l'email è obbligatorio!")
        @Size(min = 3, max = 100, message = "le note devono contenere un minimo di 2 ad un massimo di 100 caratteri")
        String note
) {
}
