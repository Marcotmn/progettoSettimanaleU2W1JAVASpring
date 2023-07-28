package marcotumminia.progettoSettimanaleU2W1JAVA.entities;



import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter

@NoArgsConstructor

@ToString
public class User {
	
	@OneToMany(mappedBy = "user")
	List<Prenotazione> prenotazione;
	
	@Id
	@GeneratedValue
	private UUID id;
	private String username;
	private String name;
	private String email;
	public User(String username, String name, String email) {
	
		
		this.username = username;
		this.name = name;
		this.email = email;
	}
	
	
}
