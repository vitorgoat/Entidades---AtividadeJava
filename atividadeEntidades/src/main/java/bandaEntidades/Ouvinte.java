package bandaEntidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ouvinte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeOuvinte;
	private int idade;

	@OneToMany
	private ArrayList<Banda> bandaArrayList = new ArrayList<Banda>();
     
	public Ouvinte(String nomeOuvinte, int idade) {
	
		this.nomeOuvinte = nomeOuvinte;
		this.idade = idade;
	}

	public String getNomeOuvinte() {

		return this.nomeOuvinte;
	}

	public int getIdade() {

		return this.idade;
	}

	public void addBanda(Banda b) {

		if (!this.bandaArrayList.contains(b)) {

			this.bandaArrayList.add(b);
		
		}
		return;
	}

	public ArrayList<Banda> getNomeBanda() {

		return bandaArrayList;
	}
}