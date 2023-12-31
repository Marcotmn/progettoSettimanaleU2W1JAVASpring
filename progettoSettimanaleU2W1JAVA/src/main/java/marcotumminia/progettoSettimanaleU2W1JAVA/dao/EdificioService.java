package marcotumminia.progettoSettimanaleU2W1JAVA.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Edificio;



@Service
@Slf4j

public class EdificioService implements EdificioDao {
	
	@Autowired
	private EdificioRepository edificioRepo;

	@Override
	public void save(Edificio edificio) {
		edificioRepo.save(edificio);
		log.info(edificio.getName() + " salvato!");
		
		
	}

}