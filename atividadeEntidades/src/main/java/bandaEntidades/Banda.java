package bandaEntidades;


import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Banda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeBanda;
	
	
	@OneToMany
	private ArrayList<Integrante> integranteArrayList = new ArrayList<Integrante>();
	
	@OneToMany
	private ArrayList<Ouvinte> ouvinteArrayList = new ArrayList <Ouvinte> ();

	public Banda(String nomeBanda, ArrayList<Integrante> integranteArrayList) {
	
		this.nomeBanda = nomeBanda;
		
		if(this.integranteArrayList == null){
		
			throw new RuntimeException("Na banda deve haver pelo menos um integrante, ou melhor, o vocalista!");
		}
                this.integranteArrayList  = integranteArrayList;
	}
	
	public String getNomeBanda() {
	
		return nomeBanda;
	}


	public void addIntegrante(Integrante i) {
	
		this.integranteArrayList.add(i);
	}
	
	public ArrayList<Integrante> getIntegrante(){
	
		return integranteArrayList;
	}

		
        public void addOuvinte(Ouvinte o) {
		
		if(this.ouvinteArrayList.contains(o) ) {
			
			return;
		}
		this.ouvinteArrayList.add(o);
		o.addBanda(this);
	}
	
	public ArrayList<Ouvinte> getOuvinte(){
	
		return ouvinteArrayList;
	}

}