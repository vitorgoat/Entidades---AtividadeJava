package bandaEntidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class InstrumentoMusical {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeInstrumento;

	@OneToOne
	private Integrante integrante;

	public InstrumentoMusical(String nomeInstrumento, Integrante integrante) {

		this.nomeInstrumento = nomeInstrumento;

		if (this.integrante == null) {

			throw new RuntimeException("O instrumento musical deve ja estar definido para um membro da banda !");
		}
	}

	public String getNomeInstrumento() {

		return nomeInstrumento;
	}

}
