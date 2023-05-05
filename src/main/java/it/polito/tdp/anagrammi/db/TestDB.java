package it.polito.tdp.anagrammi.db;

public class TestDB {

	public static void main(String[] args) {
		
		AnagrammaDAO aDao = new AnagrammaDAO(); 
		
		boolean flag = aDao.isCorrect("zurlassi"); 
		boolean flag2 = aDao.isCorrect("lalalalala"); 

		
		System.out.println(flag);
		System.out.println();
		System.out.println(flag2);


	}

}
