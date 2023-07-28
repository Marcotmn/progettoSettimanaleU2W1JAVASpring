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
@Table(name = "edificio")
@Getter
@Setter

@NoArgsConstructor

@ToString
public class Edificio {
	
	@OneToMany (mappedBy = "edificio")
	List<Postazione> postazione;
	
	@Id
	@GeneratedValue
	private UUID id;
	private String name;
	private String indirizzo;
	private String città;
	public Edificio(String name, String indirizzo, String città) {
	
		this.name = name;
		this.indirizzo = indirizzo;
		this.città = città;
	}
	
	
}