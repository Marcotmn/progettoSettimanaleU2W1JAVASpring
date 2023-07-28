package marcotumminia.progettoSettimanaleU2W1JAVA.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Prenotazione;



@Service
@Slf4j

public class PrenotazioneService implements PrenotazioneDao {
	
	@Autowired
	private PrenotazioneRepository prenotazioneRepo;

	@Override
	public void save(Prenotazione prenotazione) {
		prenotazioneRepo.save(prenotazione);
		log.info(prenotazione.getId() + " salvato!");
		
		
	}
	
}