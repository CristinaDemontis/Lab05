package it.polito.tdp.anagrammi.model;

import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.anagrammi.db.AnagrammaDAO;

public class Model {
	
	private AnagrammaDAO anagrammaDAO;
	private Anagramma anagramma ; 


	public Model() {
		anagrammaDAO = new AnagrammaDAO();
		anagramma = new Anagramma();
		
	} 
	
	public List<String> trovaAnagrammiGiusti(String parola){
		Anagramma an = new Anagramma(); 
		List<String> listaIntera = an.trovaAnagrammi(parola);
		List<String> listaCorretta = new LinkedList<>(); 
		for(String s: listaIntera) {
			try { 
				if(anagrammaDAO.isCorrect(s)) {
					listaCorretta.add(s);
				}
			}catch(Exception e){
				e.printStackTrace();
				return null; 
			}
		}
		return listaCorretta; 
		 
	}

	
	public List<String> trovaAnagrammi(String parola){
		Anagramma an = new Anagramma(); 
		List<String> lista = an.trovaAnagrammi(parola);
		return lista; 
		 
	}

	
	
	
	

}
