package marcotumminia.progettoSettimanaleU2W1JAVA.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Edificio;




@Repository
public interface EdificioRepository extends JpaRepository<Edificio, UUID> {
Optional<Edificio> findById(UUID id);
List<Edificio> findByName(String name);
List<Edificio> findByIndirizzo(String indirizzo);
List<Edificio> findByCittà(String città);
}