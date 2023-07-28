package marcotumminia.progettoSettimanaleU2W1JAVA.dao;




import marcotumminia.progettoSettimanaleU2W1JAVA.Enum.TipoPostazione;
import marcotumminia.progettoSettimanaleU2W1JAVA.entities.Postazione;


public interface PostazioneDao {
	public void save(Postazione postazione);
	
	public void findPostazioneByTipoAndCittà(TipoPostazione tipoPostazione, String città);
}
