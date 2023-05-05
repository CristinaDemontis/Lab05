package it.polito.tdp.anagrammi.model;

import java.util.HashSet;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		Model m = new Model(); 
		
		List<String> lista = m.trovaAnagrammiGiusti("abc");
		
		HashSet<String> set = new HashSet<>(lista); 
		
		
		
		System.out.println("anagrammi corretti:");
		for(String s: set) {
			System.out.println(s); 
		}
	
		List<String> lista2 = m.trovaAnagrammi("palla");

		System.out.println() ;
		System.out.println("anagrammi errati:");
		for(String s: lista2) {
			if(!lista.contains(s)){
				System.out.println(s); 
			}
		}

	
	}	

}
