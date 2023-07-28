package marcotumminia.progettoSettimanaleU2W1JAVA.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Postazione;



@Service
@Slf4j

public class PostazioneService implements PostazioneDao {
	
    @Autowired
	private PostazioneRepository postazioneRepo;

	@Override
	public void save(Postazione postazione) {
		postazioneRepo.save(postazione);
		log.info(postazione.getId() + " salvato!");
		
	}


}
