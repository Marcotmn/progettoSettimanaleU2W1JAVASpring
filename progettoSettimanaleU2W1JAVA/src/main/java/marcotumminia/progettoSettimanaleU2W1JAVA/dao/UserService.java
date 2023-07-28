package marcotumminia.progettoSettimanaleU2W1JAVA.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.User;


@Service
@Slf4j

public class UserService implements UserDao {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void save(User user) {
		userRepo.save(user);
		log.info(user.getUsername() + " salvato!");
		
		
	}

}
