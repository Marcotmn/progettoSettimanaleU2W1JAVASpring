package marcotumminia.progettoSettimanaleU2W1JAVA;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import marcotumminia.progettoSettimanaleU2W1JAVA.Enum.TipoPostazione;
import marcotumminia.progettoSettimanaleU2W1JAVA.dao.EdificioDao;
import marcotumminia.progettoSettimanaleU2W1JAVA.dao.PostazioneDao;
import marcotumminia.progettoSettimanaleU2W1JAVA.dao.PostazioneService;
import marcotumminia.progettoSettimanaleU2W1JAVA.dao.PrenotazioneDao;
import marcotumminia.progettoSettimanaleU2W1JAVA.dao.UserDao;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Edificio;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Postazione;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Prenotazione;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.User;


@Component
@Slf4j
public class Runner implements CommandLineRunner {

	@Autowired 
	private UserDao uDAO;
	
	@Autowired 
	private EdificioDao eDAO;
	
	@Autowired
	private PostazioneDao pDAO;
	
	@Autowired
	private PrenotazioneDao prDAO;
	
	
	@Override
	public void run(String... args) throws Exception {
		
	//////CREO GLI OGGETTI
		
	User user1 = new User("AldoBaio", "Aldo", "aldo@baglio.it");
	User user2 = new User("MarcoTumminia", "Marco", "marco@tumminia.it");
	User user3 = new User("LucaGuerra", "Luca", "luca@guerra.it");
	
	Edificio edificio1 = new Edificio("PrimoEdificio", "Via degli allori", "Palermo");
	Edificio edificio2 = new Edificio("SecondoEdificio", "Via delle pecore", "Trapani");
	Edificio edificio3 = new Edificio("TerzoEdificio", "Via dei miracoli forse", "Palermo");
	
	Postazione postazione1 = new Postazione("Vicino alla caffetteria", TipoPostazione.OPENSPACE, 6, true);
	Postazione postazione2 = new Postazione("In terrazza", TipoPostazione.PRIVATO , 4, true);
	Postazione postazione3 = new Postazione("Sala Riunioni", TipoPostazione.SALA_RIUNIONI, 12, true);

	Prenotazione prenotazione1 = new Prenotazione(postazione1, user1, LocalDate.of(2023, 8, 12));
	Prenotazione prenotazione2 = new Prenotazione(postazione2, user2, LocalDate.of(2023, 8, 18));
	Prenotazione prenotazione3 = new Prenotazione(postazione3, user3, LocalDate.of(2023, 8, 23));
	
	
	//uDAO.save(user1);
	//uDAO.save(user2);
	//uDAO.save(user3);
	
	//eDAO.save(edificio1);	
	//eDAO.save(edificio2);	
	//eDAO.save(edificio3);	
	
	//pDAO.save(postazione1);
	//pDAO.save(postazione2);
	//pDAO.save(postazione3);
	
	
	//prDAO.save(prenotazione1);
	//prDAO.save(prenotazione2);
	//prDAO.save(prenotazione3);
	
	pDAO.findPostazioneByTipoAndCittà(TipoPostazione.PRIVATO, "Palermo");
	
	}
}