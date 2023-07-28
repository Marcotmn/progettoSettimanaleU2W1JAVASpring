package marcotumminia.progettoSettimanaleU2W1JAVA.dao;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Prenotazione;




@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
Optional<Prenotazione> findById(UUID id);


}