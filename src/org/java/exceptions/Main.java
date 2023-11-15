package org.java.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		// EXCEPTION		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quanti libri vuoi creare? ");
		String strLibro = in.nextLine();
		int intLibro = Integer.valueOf(strLibro);
		
		int libroIndex = 0;
		Libro[] libri = new Libro[intLibro];
		while(libroIndex < intLibro) {
			
			System.out.println("Libro " + (libroIndex + 1));
			System.out.print("Titolo: ");
			String titolo = in.nextLine();
			
			System.out.print("NumeroPagine: ");
			String numeroPagine = in.nextLine();
			int intNumeroPagine = Integer.valueOf(numeroPagine);
			
			System.out.print("Autore: ");
			String autore = in.nextLine();
			
			System.out.print("Editore: ");
			String editore = in.nextLine();
			
			Libro libro = null;
			
			try {
				
				libro = new Libro(titolo, intNumeroPagine, autore, editore);
				
				libri[libroIndex++] = libro;
			} catch (Exception e) {
				
				System.out.println("Errore: " + e.getMessage());
			}
		}
		
		System.out.println(Arrays.asList(libri));
	}
}
