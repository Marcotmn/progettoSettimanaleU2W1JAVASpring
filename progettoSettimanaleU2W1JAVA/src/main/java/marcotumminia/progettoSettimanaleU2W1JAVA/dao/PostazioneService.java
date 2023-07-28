package marcotumminia.progettoSettimanaleU2W1JAVA.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import marcotumminia.progettoSettimanaleU2W1JAVA.Enum.TipoPostazione;
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
	
	@Override
	public void findPostazioneByTipoAndCittà(TipoPostazione tipoPostazione, String città) {
		List<Postazione> postazioni = postazioneRepo.findByTipoPostazioneAndEdificio_Città(tipoPostazione, città);
		if (!postazioni.isEmpty()) {
			System.out.println("Postazione trovata: " + postazioni.toString());
		} else {
		System.out.println("Nessuna posizione trovata per il tipo " +  tipoPostazione + "nella città " +  città);
	}


}
}
