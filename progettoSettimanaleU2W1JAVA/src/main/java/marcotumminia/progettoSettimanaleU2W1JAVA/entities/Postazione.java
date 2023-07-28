package marcotumminia.progettoSettimanaleU2W1JAVA.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import marcotumminia.progettoSettimanaleU2W1JAVA.Enum.TipoPostazione;

@Entity
@Table(name = "postazione")
@Getter
@Setter

@NoArgsConstructor
@ToString

public class Postazione {
	
	 @ManyToOne
	    private Edificio edificio;
	 
	 @OneToOne (mappedBy = "postazione")
	 private Prenotazione prenotazione;
	 
	@Id
	@GeneratedValue
	private UUID id;
	
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipoPostazione;
	private int maxOccupanti;
	private boolean disponibilità;

	public Postazione (String descrizione, TipoPostazione tipoPostazione, int maxOccupanti, boolean disponibilità) {
		
		this.descrizione = descrizione;
		this.tipoPostazione = tipoPostazione;
		this.maxOccupanti = maxOccupanti;
		this.disponibilità = disponibilità;
	}
	
}
