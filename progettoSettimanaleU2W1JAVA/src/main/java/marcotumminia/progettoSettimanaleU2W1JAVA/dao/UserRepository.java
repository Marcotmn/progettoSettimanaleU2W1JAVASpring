package marcotumminia.progettoSettimanaleU2W1JAVA.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marcotumminia.progettoSettimanaleU2W1JAVA.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
	Optional<User> findById(UUID id);
	List<User> findByUsername(String username);
	List<User> findByName(String name);
	List<User> findByEmail(String email);
}