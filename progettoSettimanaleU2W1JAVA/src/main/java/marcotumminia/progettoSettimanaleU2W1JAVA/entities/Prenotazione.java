package marcotumminia.progettoSettimanaleU2W1JAVA.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "prenotazione")
@Getter
@Setter
@NoArgsConstructor



@ToString
public class Prenotazione {
	
	@OneToOne
	private Postazione postazione;

	@ManyToOne
	private User user;
	

	@Id
	@GeneratedValue
	private UUID id;
    private LocalDate reservationDate;
    
    public Prenotazione (Postazione postazione, User user, LocalDate reservationDate) {
    	this.postazione = postazione;
    	this.user = user;
    	this.reservationDate = reservationDate;
    }
}