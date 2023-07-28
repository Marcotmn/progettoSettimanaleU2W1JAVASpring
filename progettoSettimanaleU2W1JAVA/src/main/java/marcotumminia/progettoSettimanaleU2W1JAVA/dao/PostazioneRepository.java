package marcotumminia.progettoSettimanaleU2W1JAVA.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marcotumminia.progettoSettimanaleU2W1JAVA.Enum.TipoPostazione;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Postazione;



@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, UUID> {
	Optional<Postazione> findById(UUID id);
	
	List<Postazione> findByTipoPostazioneAndEdificio_Città(TipoPostazione tipoPostazione, String Città);


}