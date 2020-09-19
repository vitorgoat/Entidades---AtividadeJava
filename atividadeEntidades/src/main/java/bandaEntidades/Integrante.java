package bandaEntidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Integrante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeIntegrante;

	@OneToOne
	private InstrumentoMusical instrumento;

	public Integrante(String nomeIntegrante) {

		this.nomeIntegrante = nomeIntegrante;

	}

	public void setNomeIntegrante(String nomeIntegrante) {

		this.nomeIntegrante = nomeIntegrante;
	}

	public String getNomeIntegrante() {

		return nomeIntegrante;
	}

	public void setInstrumento(InstrumentoMusical instrumentoDoMembro) {

		this.instrumento = instrumentoDoMembro;
	}

	public InstrumentoMusical getInstrumento() {

		return instrumento;
	}
}
